package com.connect.connect2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bidder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bidder_id;

    private String name;

    @OneToMany(mappedBy = "bidder", fetch = FetchType.LAZY)
    private List<Detail> detailList = new ArrayList<>();

    public Bidder() { }

    public Bidder(String name, List<Detail> detailList) {
        this.name = name;
        this.detailList = detailList;
    }

    public Long getBidder_id() {
        return bidder_id;
    }

    public void setBidder_id(Long bidder_id) {
        this.bidder_id = bidder_id;
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
        return "Bidder{" +
                "bidder_id=" + bidder_id +
                ", name='" + name + '\'' +
                ", detailList=" + detailList +
                '}';
    }
}
