package com.hxy.entity.form;

import com.hxy.contants.DataConsts;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author hexy
 * @date 2018/12/1416:56
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterForm {

    /**
     * 用户名
     */
    @Length(max = DataConsts.USERNAME_MAX_LENGTH)
    @NotEmpty(message = "用户名不能为空")
    private String username;

    /**
     * 密码
     */
    @Length(max = DataConsts.PASSWORD_MAX_LENGTH)
    @NotEmpty(message = "密码不能为空")
    private String password;

    /**
     * 确认密码
     */
    @Length(max = DataConsts.PASSWORD_MAX_LENGTH)
    @NotEmpty(message = "请再次确认密码")
    private String confirmpassword;
}
