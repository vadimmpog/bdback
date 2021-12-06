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
@Table(name = "developers")
public class Developers {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private Integer employerId;
    private String position;
    private String team;

    public void update(Developers obj){
        if (this.employerId == null || this.employerId != 0) this.setEmployerId(obj.getEmployerId());
        if (this.position == null || this.position.equals("")) this.setPosition(obj.getPosition());
        if (this.team == null || this.team.equals("")) this.setTeam(obj.getTeam());
    }
}
