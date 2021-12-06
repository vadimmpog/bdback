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
@Table(name = "clients")
public class Clients {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String company;
    private String address;
    private Boolean privateOwner;

    public void update(Clients obj){
        if (this.company == null || this.company.equals("")) this.setCompany(obj.getCompany());
        if (this.address == null || this.address.equals("")) this.setAddress(obj.getAddress());
        if (this.privateOwner == null) this.setPrivateOwner(obj.getPrivateOwner());
    }
}
