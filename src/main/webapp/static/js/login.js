/**
 * Created by yyccb on 2016-8-8.
 */

$(function () {

    //登录界面
    $('#login').dialog({
        title: '登录后台',
        width: 300,
        height: 180,
        modal: true,
        iconCls: 'icon-tip',
        buttons: '#btn',
    });

    //管理员帐号
    $('#username').validatebox({
        required: true,
        missingMessage: '请输入您的帐号',
        invalidMessage: '帐号不得为空',
    });

    //管理员密码
    $('#password').validatebox({
        required: true,
        validType: 'length[6,30]',
        missingMessage: '请输入您的密码',
        invalidMessage: '密码请在 6-30 位',
    });

    //加载时判断验证
    if (!$('#username').validatebox('isValid')) {
        $('#username').focus();
    } else if (!$('#password').validatebox('isValid')) {
        $('#password').focus();
    }

    //单击登录
    $('#btn a').click(function () {
        if (!$('#username').validatebox('isValid')) {
            $('#username').focus();
        } else if (!$('#password').validatebox('isValid')) {
            $('#password').focus();
        } else {
            // 提交到后台的RESTful
            $.ajax({
                url: '/rest/user/login/{username}/{password}',
                type: 'GET',
                data: {
                    username : $('#username').val(),
                    password : $('#password').val(),
                },
                beforeSend: function () {
                    $.messager.progress({
                        text: '正在登录中。。。',
                    });
                },
                success: function (data, response, status) {
                    $.messager.progress('close');
                    if (data.status == 200) {
                        location.href = '/rest/page/main';
                    } else {
                        $.messager.alert('登录失败！','用户名或密码错误！','warning',
                            function () {
                                $('#password').select();
                            });
                    }
                }
            });
        }
    });
});










