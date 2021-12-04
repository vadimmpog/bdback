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
@Table(name = "clients")
public class Clients {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String company;
    private String address;
    private Boolean privateOwner;

}
