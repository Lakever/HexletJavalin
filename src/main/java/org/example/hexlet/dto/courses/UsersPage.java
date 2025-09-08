package org.example.hexlet.dto.courses;
import org.example.hexlet.model.User;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter

public class UsersPage {
    private List<User> users;
}
