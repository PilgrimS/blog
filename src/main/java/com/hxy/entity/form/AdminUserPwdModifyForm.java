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
 * @date 2018/12/1416:50
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdminUserPwdModifyForm {

    @NotEmpty
    @Length(max = DataConsts.PASSWORD_MAX_LENGTH)
    private String oriPwd;
    @NotEmpty
    @Length(max = DataConsts.PASSWORD_MAX_LENGTH)
    private String newPwd;
    @NotEmpty
    @Length(max = DataConsts.PASSWORD_MAX_LENGTH)
    private String confirmPwd;
}
