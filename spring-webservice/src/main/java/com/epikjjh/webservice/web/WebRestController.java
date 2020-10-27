package com.epikjjh.webservice.web;

import com.epikjjh.webservice.web.dto.WebResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public WebResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new WebResponseDto(name, amount);
    }
}
