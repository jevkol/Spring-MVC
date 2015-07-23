package com.kolesnik.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.String;

@Controller
public class KolController {


    @RequestMapping(value = "/kol2")
    public String qwerty (Model model) {
        Room room = new Room();
        room.setNumber(12);
        room.setSeets(45);
        model.addAttribute("kol", "Hello people");
        model.addAttribute("room", room);
        return "hello";
    }


}
