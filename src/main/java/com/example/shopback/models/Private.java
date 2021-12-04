package com.example.shopback.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "privateinfo")
public class Private {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String firstname;
    private String lastname;
    private Date birthdate;
    private String phonenum;
    private String insurance;
    private String address;
    private Integer employerID;

    public void update(Private p){
        if (this.firstname == null || this.firstname.equals("")) this.setFirstname(p.getFirstname());
        if (this.lastname == null || this.lastname.equals("")) this.setLastname(p.getLastname());
        if (this.birthdate == null) this.setBirthdate(p.getBirthdate());
        if (this.phonenum == null || this.phonenum.equals("")) this.setPhonenum(p.getPhonenum());
        if (this.insurance == null || this.insurance.equals("")) this.setInsurance(p.getInsurance());
        if (this.address == null || this.address.equals("")) this.setAddress(p.getAddress());
        if (this.employerID == null || this.employerID == 0) this.setEmployerID(p.getEmployerID());
    }
}
