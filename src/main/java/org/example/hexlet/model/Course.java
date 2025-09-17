package org.example.hexlet.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor

@ToString
public class Course {
    private Long id;
    private static long counter = 0;

    @ToString.Include
    private String name;
    private String description;

    public Course(String name, String description) {
        this.id = counter++;
        this.name = name;
        this.description = description;
    }
}
