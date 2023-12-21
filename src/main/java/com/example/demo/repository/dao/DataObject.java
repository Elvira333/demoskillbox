package com.example.demo.repository.dao;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "data")
public class DataObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "the field can't be empty")
    @Size(max = 255, message = "input is blank or missing length limits")
    private String text;

    public DataObject(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DataObject(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public DataObject() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Data{id=" + id + ", text='" + text + "'}";
    }
}
