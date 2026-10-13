package kr.ac.kopo.psjjj._026example.domain;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity@Data
public class Team {
    private Integer id;
    private String name;

}
