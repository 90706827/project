package com.jimmy.result;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName RestResponse
 * @Description RestFul接口返回结果
 * @Author Mr.Jangni
 * @Date 2019/3/25 19:43
 * @Version 1.0
 **/
@Data
public class Result<T> implements Serializable {

    private String code;
    private String desc;
    private T data;

    public Result() {
    }

    public Result(RespCode respCode) {
        this.code = respCode.getCode();
        this.desc = respCode.getDesc();
    }

    @JsonIgnore
    public boolean isSuccessful() {
        return "000000".equals(this.code);
    }

    public static <T> Result<T> fromSuccessfulResult(T data) {
        Result<T> result = new Result<>(RespCode.OK);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> fromFailedResult(RespCode code) {
        return new Result<>(code);
    }
}
