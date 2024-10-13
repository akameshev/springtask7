package org.project.springtask7home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * для демонстрации перейдите на http://localhost:8080/login
 */
@Controller
@RequestMapping()
public class DataController {

    @GetMapping("/public-data")
    @ResponseBody
    public String getPublicData() {
        return "Доступ к общедоступным данным.";
    }

    @GetMapping("/private-data")
    @ResponseBody
    public String getPrivateData() {
        return "Доступ к приватным данным только для ADMIN.";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/403")
    public String accessDenied() {
        return "403";
    }
}
