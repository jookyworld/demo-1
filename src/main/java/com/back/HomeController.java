package com.back;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
                <h1>Welcome to the Home Page of JooKwonYoung</h1>
                                <p>This is a Demo Spring Boot application.</p>
                """;
    }
}
