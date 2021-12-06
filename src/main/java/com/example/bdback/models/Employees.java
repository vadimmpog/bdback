package com.example.bdback.models;

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
    private Integer employerId;
    private String mail;
    private Integer wage;
    private Boolean onLeave;
    private String workplace;
}
