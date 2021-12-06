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
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String productName;
    private String version;
    private Boolean inProgress;

    public void update(Products p){
        if (this.productName == null || this.productName.equals("")) this.setProductName(p.getProductName());
        if (this.version == null || this.version.equals("")) this.setVersion(p.getVersion());
        if (this.inProgress == null) this.setInProgress(p.getInProgress());
    }
}
