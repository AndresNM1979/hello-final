package com.viewnext.hellofinal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class HomeController {

    @RequestMapping("/hola")
    public @ResponseBody String hola() {
        return "Hola, esta ha sido el final del curso.";
    }

}
