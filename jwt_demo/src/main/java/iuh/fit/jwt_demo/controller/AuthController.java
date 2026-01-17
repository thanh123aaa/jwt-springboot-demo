package iuh.fit.jwt_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import iuh.fit.jwt_demo.util.JwtUtil;

@RestController
public class AuthController {

    @GetMapping("/token")
    public String token() {
        return JwtUtil.generateToken("admin");
    }
}
