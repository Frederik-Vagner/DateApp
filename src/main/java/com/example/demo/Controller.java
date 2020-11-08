package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping ("/")
    public String welcome() {
        return ("welcome");
    }

    @GetMapping("/home")
    public String home() {
        return ("home");
    }


    @GetMapping("/administrator")
    public String administrator() {
        return ("administrator");
    }

    @GetMapping("/user")
    public String user() {
        return ("user");
    }

        @GetMapping("/login")
        public String login() {
            return ("login");

    }

    //bruger

    @GetMapping("/findMatch")
    public String findMatch() {
        return ("findMatch");
    }

    @GetMapping("/editProfile")
    public String editProfile() {
        return ("editProfile");
    }

    @GetMapping("/sendMessage")
    public String sendMessage() {
        return ("sendMessage");
    }

    @GetMapping("/profile")
    public String profile() {
        return ("profile");
    }



    //footer

    @GetMapping("/privatLivsPolitik")
    public String privatLivsPolitik() {
        return ("privatLivsPolitik");
    }

    @GetMapping("/userCreation")
    public String userCreation() {return ("userCreation"); }

    @GetMapping("/profilenen")
    public String profilenen() {return ("profilenen"); }

}

