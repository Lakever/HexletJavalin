package org.example.hexlet.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class User {
    private static long counter = 0;

    private Long id;

    @ToString.Include
    private String lastName;
    private String firstName;

    public User(String lastName, String firstName) {
        this.id = counter ++;
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
