package com.connect.connect2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long owner_id;

    private String name;

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    private List<Detail> detailList = new ArrayList<>();

    public Owner() { }

    public Owner(String name, List<Detail> detailList) {
        this.name = name;
        this.detailList = detailList;
    }

    public Long getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Long owner_id) {
        this.owner_id = owner_id;
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
        return "Owner{" +
                "owner_id=" + owner_id +
                ", name='" + name + '\'' +
                ", detailList=" + detailList +
                '}';
    }
}
