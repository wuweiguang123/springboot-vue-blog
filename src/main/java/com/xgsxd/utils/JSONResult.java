package com.xgsxd.utils;

public class JSONResult<T> {

    private String message; //消息

    private int statusCode; //状态码

    private String status; //是否成功

    private T data; //数据

    public JSONResult() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JSONResult{" +
                "message='" + message + '\'' +
                ", statusCode=" + statusCode +
                ", status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
