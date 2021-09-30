package com.jimmy.exception;

import com.jimmy.result.RespCode;
import lombok.Getter;

/**
 * @Description
 * @Author zhangguoq
 **/
public class ServiceException  extends RuntimeException {

    /**
     * 错误代码
     */
    private RespCode respCode;

    public ServiceException(RespCode respCode, Throwable cause) {
        super(respCode.getCode(), cause);
        this.respCode = respCode;
    }

    public RespCode getRespCode() {
        return respCode;
    }
}