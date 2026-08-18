package kr.ac.kopo.psjjj._026example.controller;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/exam11_01")
public class Chap11_01Controller {
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "그럴만한 이유가 있겠죠?")
    @GetMapping("/exam01")
    public void requestMethod01(){
        System.out.println(new IllegalArgumentException("요청 실패").getMessage());
    }

    @GetMapping("/exam02")
    public void requestMethod02() throws Exception{
        throw new Exception(new UserException("UserException 메시지입니다."));
    }
}
