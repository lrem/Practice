package com.apache.domain;

/**
 * Created by zhongjing on 2015/11/26 0026.
 */
public class Box<T> {
    private T data;

    public Box() {

    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
