package com.example.mapper;

import com.example.jex00.config.RootConfig;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class)//해당코드가 스프링 실행 역활 한다고 알려주는것
@ContextConfiguration(classes = {RootConfig.class})//지정된 클래스나 문자열 이용해서 필요한 객체를 등록해줌, 클래스패스나 파일 이용해서 경로 지정
public class TimeMapperTests {

    @Autowired//테스트 코드에서는 자동주입이 안되서 오토와일드
    TimeMapper timeMapper;//객체는 문제가 없는데 마이바티스가 버전이 낮아서 빨간줄 생겼음

    @Test
    public void testGetTime1(){
        log.info(timeMapper);
        log.info(timeMapper.getTime());
    }
}
