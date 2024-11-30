package com.wit.inspaction.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/wit")
public class TestController {

    @GetMapping("/test") // /wit/test 경로 매핑
    public String showTestPage() {
        System.out.println("온다온다.");
        return "test"; // "test.jsp"를 렌더링
    }
}
	
