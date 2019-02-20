package com.activedroute.activatedroute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Task")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Task_Id")
    private Long id;

    @Column(name = "Name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "task", fetch = FetchType.LAZY)
    private List<PersonTask> personTasks;

    public Task() { }

    public Task(String name, List<PersonTask> personTasks) {
        this.name = name;
        this.personTasks = personTasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PersonTask> getPersonTasks() {
        return personTasks;
    }

    public void setPersonTasks(List<PersonTask> personTasks) {
        this.personTasks = personTasks;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", personTasks=" + personTasks +
                '}';
    }
}
