package com.hwaner.realtyutils.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hwaner
 * @created at 2022/04/21 11:53
 * @description: 서버 배포 후에 잘 실행이 되는지 헬스 체크를 하는데, api call (200을 받는지)
 */
// api 호출하는 restcontroller
@RestController
public class HealthCheckController {
    // 경로 호출 mapping
    @GetMapping("/api/ping")
    public String ping() {
        return "ok";
    }
}
