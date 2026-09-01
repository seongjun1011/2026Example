package kr.ac.kopo.psjjj._026example.domain;

import lombok.Data;

@Data
public class Person {
    private String name;
    private String age;
    private String email;

    // 1. 방금 에러난 new Person() 을 위한 기본 생성자 (이걸 꼭 추가해야 합니다!)
    public Person() {
    }

    // 2. 아까 name:, age: 힌트를 띄우기 위해 만든 3개짜리 생성자
    public Person(String name, String age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}