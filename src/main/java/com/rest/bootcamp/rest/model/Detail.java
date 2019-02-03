package com.connect.connect2.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Detail
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectdetail_id;

    private Date startdate;
    private Date enddate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id")
    private Task task;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bidder_id")
    private Bidder bidder;


    public Detail() { }

    public Detail(Date startdate, Date enddate, Project project, Task task, Owner owner, Bidder bidder) {
        this.startdate = startdate;
        this.enddate = enddate;
        this.project = project;
        this.task = task;
        this.owner = owner;
        this.bidder = bidder;
    }

    public Long getProjectdetail_id() {
        return projectdetail_id;
    }

    public void setProjectdetail_id(Long projectdetail_id) {
        this.projectdetail_id = projectdetail_id;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Bidder getBidder() {
        return bidder;
    }

    public void setBidder(Bidder bidder) {
        this.bidder = bidder;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "projectdetail_id=" + projectdetail_id +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", project=" + project +
                ", task=" + task +
                ", owner=" + owner +
                ", bidder=" + bidder +
                '}';
    }
}
