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
@Table(name = "tasks")
public class Tasks {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private Integer projectId;
    private Integer employerId;
    private String description;
    private String team;

    public void update(Tasks obj){
        if (this.projectId == null || this.projectId != 0) this.setProjectId(obj.getProjectId());
        if (this.employerId == null || this.employerId != 0) this.setEmployerId(obj.getEmployerId());
        if (this.description == null || this.description.equals("")) this.setDescription(obj.getDescription());
        if (this.team == null || this.team.equals("")) this.setTeam(obj.getTeam());

    }
}
