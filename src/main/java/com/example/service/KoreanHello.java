package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class KoreanHello implements Hello{
    @Override
    public String sayHello() {
        return " an nenung ha se yo";
    }
}
