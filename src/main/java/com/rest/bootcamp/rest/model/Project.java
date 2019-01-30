package com.connect.connect2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long project_id;

    private String name;

    @OneToMany(mappedBy = "project", fetch = FetchType.LAZY)
    private List<Detail> detailList = new ArrayList<>();

    public Project() { }

    public Project(String name, List<Detail> detailList) {
        this.name = name;
        this.detailList = detailList;
    }

    public Long getProject_id() {
        return project_id;
    }

    public void setProject_id(Long project_id) {
        this.project_id = project_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Detail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<Detail> detailList) {
        this.detailList = detailList;
    }

    @Override
    public String toString() {
        return "Project{" +
                "project_id=" + project_id +
                ", name='" + name + '\'' +
                ", detailList=" + detailList +
                '}';
    }
}
