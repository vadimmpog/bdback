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

    public void update(Employees obj){
        if (this.mail == null || this.mail.equals("")) this.setMail(obj.getMail());
        if (this.wage == null || this.wage != 0) this.setWage(obj.getWage());
        if (this.onLeave == null) this.setOnLeave(obj.getOnLeave());
        if (this.workplace == null || this.workplace.equals("")) this.setWorkplace(obj.getWorkplace());
    }
}
