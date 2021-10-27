package com.example.test1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    @GetMapping("event2")
    public String event2() {
        return "event2";
    }

    @GetMapping("event3")
    public String event3() {
        return "event3";
    }
}
