package com.js.util;/** * @author  作者 E-mail: * @date 创建时间：2017年10月24日 上午10:53:23 * @version 1.0 * @parameter  * @since  * @return  */
public class Result<T> {
    private String code;
    private String msg;
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
}