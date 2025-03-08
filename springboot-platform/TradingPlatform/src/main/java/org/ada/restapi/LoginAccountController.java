package org.ada.restapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class LoginAccountController{

    @PostMapping("/AccountPost")
    public String AccountPost(){
        return String.format("tester");
    }

    @GetMapping("/AccountLogin")
    public String AccountLogin() {
        return String.format("tester");
    }

    @DeleteMapping("/AccountDelete")
    public String AccountDelete() {
        return String.format("tester");
    }

    @PutMapping("/AccountEmailUpdate")
    public String AccountEmailUpdate() {
        return String.format("tester");
    }
}