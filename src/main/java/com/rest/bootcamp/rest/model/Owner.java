package com.connect.connect2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long owner_id;

    private String owner_name;

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    private List<Detail> detailList = new ArrayList<>();

    public Owner() { }

    public Owner(String projectOwner_name, List<Detail> detailList) {
        this.owner_name = projectOwner_name;
        this.detailList = detailList;
    }

    public Long getProjectOwner_id() {
        return owner_id;
    }

    public void setProjectOwner_id(Long projectOwner_id) {
        this.owner_id = projectOwner_id;
    }

    public String getProjectOwner_name() {
        return owner_name;
    }

    public void setProjectOwner_name(String projectOwner_name) {
        this.owner_name = projectOwner_name;
    }

    public List<Detail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<Detail> detailList) {
        this.detailList = detailList;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "projectOwner_id=" + owner_id +
                ", projectOwner_name='" + owner_name + '\'' +
                ", detailList=" + detailList +
                '}';
    }
}
