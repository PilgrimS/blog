package com.hxy.entity.response;

import lombok.Data;

/**
 * @author hexy
 * @date 2018/12/1410:55
 */
@Data
public class GlobalResponse {
    protected int resultCode;
    protected boolean hasError;

    private GlobalResponse() {

    }

    public GlobalResponse(int resultCode, boolean hasError) {
        this.resultCode = resultCode;
        this.hasError = hasError;
    }
}
