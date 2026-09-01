package kr.ac.kopo.psjjj._026example.controller;


import kr.ac.kopo.psjjj._026example.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam13_03")
public class Chap13_03Controller {
    @GetMapping
    public Person showJsonTypeData(){
        Person person = new Person();
        person.setName("Polykim");
        person.setAge("30");
        person.setEmail("polykim@kopo.ac.kr");
        System.out.println(person);
        return person;
    }
}

