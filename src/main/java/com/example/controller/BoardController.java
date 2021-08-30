package com.example.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")//보드로 들어 오는 모든 리퀘스트는 얘가 잡아먹는다
@Log4j2
public class BoardController {

    @GetMapping("/list")//get 방식으로 들어오는데
    public void lis1t() {//void를 쓰면 board/list.jsp파일을 찾는다
        log.info("list------------------");
        log.info("list------------------");
        log.info("list------------------");
        log.info("list------------------");
    }
}
