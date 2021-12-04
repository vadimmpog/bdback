package com.example.shopback.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "testers")
public class Testers {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String position;
    private String team;
    private Integer employerID;

}
