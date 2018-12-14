package com.hxy.entity.response.factory;

import com.hxy.entity.response.RedirectResponse;
import com.hxy.entity.response.SimpleResponse;
import org.springframework.stereotype.Component;

import static com.hxy.contants.StatusCode.NO_ERROR;
import static com.hxy.contants.StatusCode.RESPONSE_OK;
import static com.hxy.contants.StatusCode.WITH_ERROR;

/**
 * @author hexy
 * @date 2018/12/1411:46
 */
@Component(value = "generalJsonFactory")
public class GeneralJsonFactory implements JsonFactory {

    /**
     * 通用正常响应
     */
    @Override
    public SimpleResponse createSimpleResponse() {
        return new SimpleResponse(RESPONSE_OK, NO_ERROR);
    }

    @Override
    public SimpleResponse createtSimpleErrorResponse() {
        return new SimpleResponse(RESPONSE_OK, WITH_ERROR);
    }

    /**
     * 带参数的统一响应
     * param resultCode 状态码
     *
     * @param hasError 是否需异常
     */
    @Override
    public SimpleResponse createSimpleResponse(int resultCode, boolean hasError) {
        return new SimpleResponse(resultCode, hasError);
    }

    @Override
    public RedirectResponse createRedirectResponse(int resultCode, boolean hasError, String redirectURL) {
        return new RedirectResponse(resultCode, hasError, redirectURL);
    }

}
