package com.hxy.entity.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author hexy
 * @date 2018/12/1416:55
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginForm {

    /**
     * 用户名
     */
    @NotEmpty(message = "用户名不能为空")
    private String username;

    /**
     * 密码
     */
    @NotEmpty(message = "密码不能为空")
    private String password;

    /**
     * 记住登录
     */
    private String rememberme;
}
