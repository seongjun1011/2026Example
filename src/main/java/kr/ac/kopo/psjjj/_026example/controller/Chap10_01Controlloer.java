package kr.ac.kopo.psjjj._026example.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("/exam10_01")
public class Chap10_01Controlloer { // 💡 클래스명 오타 수정 (Controlloer -> Controller)

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
        model.addAttribute("viewName", "mamberPage.html"); // 오타(mamber)는 기존 코드 유지
        return "memberPage";
    }

    @GetMapping("/home/main")
    public String requestMethod5(Model model){
        // 💡 뷰 페이지에서 사용할 viewName 데이터를 Model에 추가했습니다.
        model.addAttribute("viewName", "homePage.html");
        return "homePage";
    }

    @GetMapping("/exam02")
    public String requestMethod6(Model model){
        return "redirect:/member/user";
    }

    @GetMapping("/member/user")
    public String requestMethod7(Authentication authentication, Model model){
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String userName = userDetails.getUsername();
        String password = userDetails.getPassword();
        model.addAttribute("userName", userName);
        model.addAttribute("password", password);
        model.addAttribute("uri", "/member/user");
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        for(GrantedAuthority item : authorities){
            model.addAttribute("role", item + " ");
        }

        return "viewPage10_02";
    }

    @GetMapping("/exam03")
    public String requestmethod8(Model model){
        return "viewPage10_03";
    }

    @GetMapping("/manager_tag")
    public String requestmethod9(Model model){
        return "viewPage10_03";
    }

}