package com.evergrande.mybatis.model;

import com.evergrande.mybatis.common.Entity;
import lombok.Data;

/**
 * 测试bean
 *
 * Created by cuican on 2016-11-30.
 */
@Data
public class User extends Entity {

    private String userName;
    private String password;
    private String mobileNo;
    private String avatar;

}
