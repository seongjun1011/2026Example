package kr.ac.kopo.psjjj._026example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;

@Controller
public class Chap05_02Controller {

    @GetMapping("/chap0502/{name}")
    public String requestMethod(@PathVariable("name") String name, Model model) {
        model.addAttribute("name", name);

        return "viewPage05_02";
    }
    @GetMapping("/chap0502/{age}")
    public String requestMethod(@PathVariable("name") String name, @PathVariable("birthyears") int birthYears, Model model) {
        Calendar calendar = Calendar.getInstance();
        int nowYear = calendar.get(Calendar.YEAR);
        int age = 2026 - birthYears;

        model.addAttribute("name", name);
        model.addAttribute("birthyears", birthYears);
        model.addAttribute("age", age);
        return "viewPage05_02";
    }

}

