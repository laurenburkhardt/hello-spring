package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@ResponseBody
//@RequestMapping("hello")
public class HelloController {


//    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public String hello(@RequestParam String coder) {
//        return "Hello, " + coder + "!";
//    }

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

    @GetMapping
    @ResponseBody
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/hello'>" +
                        "<input type = 'text' name = 'coder' />" +
                        "<select name = 'language'>"+
                        "<option value = 'English'>English</option>"+
                        "<option value = 'French'>French</option>"+
                        "<option value = 'Spanish'>Spanish</option>"+
                        "<option value = 'German'>German</option>"+
                        "<option value = 'Kazakh'>Kazakh</option>"+
                        "</select>"+
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }


}
