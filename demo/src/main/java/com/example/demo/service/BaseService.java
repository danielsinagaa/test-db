package com.example.demo.service;

public interface BaseService<R, Q> {

    public R execute (Q request);
}
