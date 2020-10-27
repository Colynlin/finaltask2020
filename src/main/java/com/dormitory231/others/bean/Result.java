package com.dormitory231.others.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author ColynLin
 * @Date 2020/10/19 23:25
 */
@Data
public class Result implements Serializable {

    private int code; // normal:200
    private String msg;
    private Object data;

    public static Result success(Object data) {
        return success(200, "操作成功", data);
    }

    public static Result success(int code, String msg, Object data) {
        return setState(code, msg, data);
    }

    public static Result fail(String msg) {
        return fail(400, msg, null);
    }

    public static Result fail(String msg, Object data) {
        return fail(400, msg, data);
    }

    public static Result fail(int code, String msg, Object data) {
        return setState(code, msg, data);
    }

    public static Result setState(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
