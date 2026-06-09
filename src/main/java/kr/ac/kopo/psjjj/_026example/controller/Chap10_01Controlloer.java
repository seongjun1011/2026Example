package kr.ac.kopo.psjjj._026example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam10_01")
public class Chap10_01Controlloer {

    @GetMapping("/")
    public String requestMethod(Model model){
        return "viewPage10_01";
    }

    @GetMapping("/admin/main")
    public String requestMethod2(Model model){
        model.addAttribute("viewName", "adminPage.html");
        return "adminPage";
    }

    @GetMapping("/manager/main")
    public String requestMethod3(Model model){
        model.addAttribute("viewName", "managerPage.html");
        return "managerPage";
    }

    @GetMapping("/member/main")
    public String requestMethod4(Model model){
        model.addAttribute("viewName", "mamberPage.html");
        return "memberPage";
    }

    @GetMapping("/home/main")
    public String requestMethod5(Model model){
        return "homePage";
    }



}
