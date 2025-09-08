package org.example.hexlet.dto.courses;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.hexlet.model.User;

@AllArgsConstructor
@Getter
@Setter
public class FooterPage {
    private String desc;
    private User user;
}
