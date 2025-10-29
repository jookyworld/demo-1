package com.back;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
                <h1>www.jooky.site</h1>
                                <p>spring boot 프로젝트</p>
                                <p>자동배포 환경</p>
                """;
    }
}
