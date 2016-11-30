package com.evergrande.mybatis.controller;

import com.evergrande.mybatis.model.UserInfo;
import com.evergrande.mybatis.service.UserInfoService;
import com.evergrande.mybatis.util.SHA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yyccbbz on 2016-8-11.
 */
@RequestMapping("rest/user")
@Controller
public class UserInfoController {


    /**
     * 通用的页面访问方法
     *
     * //@param pageName
     * @return

    @RequestMapping("{pageName}")
    public String toPage(@PathVariable("pageName") String pageName) {
        return pageName;
    }*/

    // /rest/user/userId
//    @RequestMapping(value = "login/{username}/{password}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<UserInfo> queryUserById(@PathVariable("username") String username, @PathVariable("password") String password) {
//        try {
//            UserInfo userInfo = new UserInfo();
//            userInfo.setUsername(username);
//            String pwd = SHA.encryptSHA(password);
//            userInfo.setUsername(pwd);
//            UserInfo user = this.userInfoService.selcetOne(userInfo);
//            if (null == user) {
//                // 资源不存在
//                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//            }
//            return ResponseEntity.ok(user);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        // 查询出错，响应500
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//    }


}
