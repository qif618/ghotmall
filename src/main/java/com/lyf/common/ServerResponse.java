package com.lyf.common;

import java.io.Serializable;

/**
 * Created by Quincy on 2018/3/6.
 */
public class ServerResponse<T> implements Serializable {
    private int status;
    private T data;
    private String msg;

    private ServerResponse(int status){
        this.status =status;
    }

    public ServerResponse(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ServerResponse(int status, T data) {
        this.status = status;
        this.data = data;
    }

    public ServerResponse(int status, T data, String msg) {
        this.status = status;
        this.data = data;
        this.msg = msg;
    }
}

