package com.toprate.hr_tek_demo.controller;

import com.toprate.hr_tek_demo.secvice.UserService;
import com.toprate.hr_tek_demo.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    OAuth2AuthorizedClientService authorizedClientService;

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String getStart() {
        return "/home";
    }

    @GetMapping("/home")
    public String getHome(){
        return "index";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/403")
    public String accessDenied(Model model) {
        model.addAttribute("statusCode", Constants.ERROR.FORBIDDEN_CODE);
        model.addAttribute("error", Constants.ERROR.FORBIDDEN_TEXT);
        model.addAttribute("errorMessage", Constants.ERROR.ERROR_MESSAGE);
        return "error/default";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

}
