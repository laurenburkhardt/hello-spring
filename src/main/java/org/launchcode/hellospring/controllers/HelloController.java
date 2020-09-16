package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class HelloController {

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String language, @RequestParam String coder) {
        return switch (language.toLowerCase()) {
            case "french" -> "Bonjour, " + coder + "!";
            case "german" -> "Guten tag, " + coder + "!";
            case "english" -> "Hello, " + coder + "!";
            case "spanish" -> "Hola, " + coder + "!";
            case "kazakh" -> "Sàlemetsizbe, " + coder + "?";
            default -> "";
        };
    }

    @GetMapping("form")
    public String helloForm() {
       return "form";
    }


}
