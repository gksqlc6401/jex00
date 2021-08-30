package com.example.jex00.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Log4j2
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        log.info("1-------------------------------");
        log.info("1-------------------------------");

        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        log.info("2-----------------------------------");
        log.info("2-----------------------------------");

        return new Class[]{ServletConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
