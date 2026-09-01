package kr.ac.kopo.psjjj._026example.controller;


import kr.ac.kopo.psjjj._026example.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/exam13_06")
public class Chap13_06Controller {
    @GetMapping
    public String showForm(@ModelAttribute Person person){
        return "viewPage13_06_form";
    }

//    @RequestBody는 폼의 input 태그의 name과 사용자가 입력된 값을 사용해서 키와 값으로 구성된 json 형식의 Rest 문자열로 만듦
    @PutMapping
    public String submit(@ModelAttribute Person param, Model model){
        model.addAttribute("data1", "@RequestBody로 정보 받기");
        model.addAttribute("data2", param);
        return "viewPage13_06_result";
    }
}
