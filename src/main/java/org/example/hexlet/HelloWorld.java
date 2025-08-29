package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import static io.javalin.rendering.template.TemplateUtil.model;


import org.example.hexlet.model.Course;
import org.example.hexlet.dto.courses.CoursesPage;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });
        // Описываем, что загрузится по адресу /
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("English","Learning English"));
        courses.add(new Course("German","Learning German"));
        app.get("/courses", ctx -> {

            var header = "Языковые курсы";
            var page = new CoursesPage(courses, header);
            ctx.render("courses/show.jte", model("page", page));
        });
        app.start(7070); // Стартуем веб-сервер
        //da
    }
}