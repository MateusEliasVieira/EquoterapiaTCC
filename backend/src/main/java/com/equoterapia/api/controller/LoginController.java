package com.equoterapia.api.controller;

import com.equoterapia.utils.Feedback;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Login")
public class LoginController {

    @Operation(method = "GET", description = "Teste")
    @GetMapping("/ok")
    public String ok(){
        return Feedback.TEST;
    }

}
