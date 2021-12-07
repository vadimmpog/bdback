package com.example.bdback.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contracts")
public class Contracts {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private Integer projectId;
    private Integer clientId;
    private String paymentState;
    private Date startOfContract;
    private Date endOfContract;

    public void update(Contracts obj){
        if (this.clientId == null || this.clientId != 0) this.setClientId(obj.getClientId());
        if (this.paymentState == null || this.paymentState.equals("")) this.setPaymentState(obj.getPaymentState());
        if (this.startOfContract == null) this.setStartOfContract(obj.getStartOfContract());
        if (this.endOfContract == null) this.setEndOfContract(obj.getEndOfContract());
    }
}
