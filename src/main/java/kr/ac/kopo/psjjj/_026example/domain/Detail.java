package kr.ac.kopo.psjjj._026example.domain;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private float weight;
    private float width;
    private float height;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detail_id")
    private Detail detail;
}
