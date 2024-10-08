package com.sonarqube.sonarqube.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class File1 {
    public void newMethod() {
        log.info("This is new line 1");
        log.info("This is new line 2");
        log.info("This is new line 3");
        log.info("This is new line 4");
    }

    public void myMethod() {
        log.info("My Method 1");
        log.info("My Method 2");
        log.info("My Method 3");
        log.info("My Method 4");
    }

    public void myMethod2() {
        log.info("My Method 11");
        log.info("My Method 22");
        log.info("My Method 33");
        log.info("My Method 44");
    }

    public void myName() {
        log.info("My Name 1");
        log.info("My Name 2");
        log.info("My Name 3");
        log.info("My Name 4");
        log.info("My Name 4");
        log.info("My Name 4");
    }
}
