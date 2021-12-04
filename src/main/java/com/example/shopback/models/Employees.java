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
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer employerID;
    private String mail;
    private Integer wage;
    private Boolean onLeave;
    private String workplace;
}
