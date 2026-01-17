package iuh.fit.jwt_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import iuh.fit.jwt_demo.util.JwtUtil;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestHeader("Authorization") String token) {
        String user = JwtUtil.validateToken(token.replace("Bearer ", ""));
        return "Hello " + user;
    }
}
