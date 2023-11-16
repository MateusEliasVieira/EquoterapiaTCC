package com.equoterapia.api.controller;

import com.equoterapia.utils.Feedback;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class LoginController {

    @GetMapping("/ok")
    public String ok(){
        return Feedback.TEST;
    }

}
