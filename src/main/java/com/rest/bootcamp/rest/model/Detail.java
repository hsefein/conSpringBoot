package com.connect.connect2.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Detail
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectdetail_id;

    private LocalDate Start_Date;
    private LocalDate End_Date;

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

    public Detail(LocalDate start_Date, LocalDate end_Date, Project project, Task task, Owner owner, Bidder bidder) {
        Start_Date = start_Date;
        End_Date = end_Date;
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

    public LocalDate getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(LocalDate start_Date) {
        Start_Date = start_Date;
    }

    public LocalDate getEnd_Date() {
        return End_Date;
    }

    public void setEnd_Date(LocalDate end_Date) {
        End_Date = end_Date;
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
                ", Start_Date=" + Start_Date +
                ", End_Date=" + End_Date +
                ", project=" + project +
                ", task=" + task +
                ", owner=" + owner +
                ", bidder=" + bidder +
                '}';
    }
}
