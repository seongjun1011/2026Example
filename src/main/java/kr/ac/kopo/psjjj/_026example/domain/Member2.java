package kr.ac.kopo.psjjj._026example.domain;


import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Member2 {
    @MemberId
    private String memberId;

    @Size(min = 4, max = 10, message = "최소 4 ~ 10문자열로 작성해야함.")
    private String passwd;

}
