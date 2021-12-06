package com.example.bdback.models;

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
@Table(name = "contracts")
public class Contracts {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer projectId;
    private Integer clientId;
    private String paymentState;
    private Date startOfContract;
    private Date endOfContract;

}
