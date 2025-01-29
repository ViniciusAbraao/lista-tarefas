package com.edu.vini.thyme.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Task {

    public Task(Long id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public Task() {

    }

    private Long id;
    private String name;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

}
