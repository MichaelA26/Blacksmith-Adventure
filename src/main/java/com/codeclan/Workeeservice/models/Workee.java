package com.codeclan.Workeeservice.models;


import javax.persistence.*;

@Entity
@Table(name="workees")

public class Workee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;

    @Column(name="workeeNumber")
    private int workeeNumber;

    @Column(name="email")
    private String email;

    public Workee(String name, int age, int workeeNumber, String email) {
        this.name = name;
        this.age = age;
        this.workeeNumber = workeeNumber;
        this.email = email;
    }

    public Workee(){
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkeeNumber() {
        return workeeNumber;
    }

    public void setWorkeeNumber(int workeeNumber) {
        this.workeeNumber = workeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
