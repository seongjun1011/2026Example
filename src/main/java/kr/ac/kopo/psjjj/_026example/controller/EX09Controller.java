package kr.ac.kopo.psjjj._026example.controller;

import kr.ac.kopo.psjjj._026example.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EX09Controller {
    @GetMapping("/member")
    public String requestForm() {
        return "signup";
    }

    @PostMapping("/member")
    public String requestFormResult(@ModelAttribute Member member, Model model) {
//        model.addAttribute("member", member); 생략가능
        return "signResult";
    }


    @InitBinder
    public void initBinder(WebDataBinder binder){
//        binder.setAllowedFields("id", "city", "hobby");
        binder.setAllowedFields("passwd", "city");
    }
}

