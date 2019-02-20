package com.activedroute.activatedroute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "PersonTask")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PersonTask {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PersonTask_Id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Person_Id", foreignKey = @ForeignKey(name = "Person_Id_FK"))
    private Person person;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Task_Id", foreignKey = @ForeignKey(name = "Task_Id_FK"))
    private Task task;

    public PersonTask() { }

    public PersonTask(Person person, Task task) {
        this.person = person;
        this.task = task;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "PersonTask{" +
                "id=" + id +
                ", person=" + person +
                ", task=" + task +
                '}';
    }
}
