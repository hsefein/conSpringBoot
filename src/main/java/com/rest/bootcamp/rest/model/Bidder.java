package com.connect.connect2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bidder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bidder_id;

    private String bidder_name;

    @OneToMany(mappedBy = "bidder", fetch = FetchType.LAZY)
    private List<Detail> detailList = new ArrayList<>();

    public Bidder() { }

    public Bidder(String taskBidder_name, List<Detail> detailList) {
        this.bidder_name = taskBidder_name;
        this.detailList = detailList;
    }

    public Long getTaskBidder_id() {
        return bidder_id;
    }

    public void setTaskBidder_id(Long taskBidder_id) {
        this.bidder_id = taskBidder_id;
    }

    public String getTaskBidder_name() {
        return bidder_name;
    }

    public void setTaskBidder_name(String taskBidder_name) {
        this.bidder_name = taskBidder_name;
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
                "taskBidder_id=" + bidder_id +
                ", taskBidder_name='" + bidder_name + '\'' +
                ", detailList=" + detailList +
                '}';
    }
}
