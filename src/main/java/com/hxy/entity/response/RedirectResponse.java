package com.hxy.entity.response;

import lombok.Data;

/**
 * @author hexy
 * @date 2018/12/1410:57
 */
@Data
public class RedirectResponse extends  GlobalResponse{
    private String redirectURL;

    public RedirectResponse(int resultCode, boolean hasError, String redirectURL) {
        super(resultCode, hasError);
        setRedirectURL(redirectURL);
    }
}
