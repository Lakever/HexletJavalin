package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import static io.javalin.rendering.template.TemplateUtil.model;


import org.example.hexlet.dto.courses.FooterPage;
import org.example.hexlet.dto.courses.Page;
import org.example.hexlet.dto.courses.UsersPage;
import org.example.hexlet.dto.courses.WelcomePage;
import org.example.hexlet.model.User;

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
//        List<Course> courses = new ArrayList<>();
//        courses.add(new Course("English","Learning English"));
//        courses.add(new Course("German","Learning German"));
//        app.get("/courses", ctx -> {
//
//            var header = "Языковые курсы";
//            var page = new CoursesPage(courses, header);
//            ctx.render("courses/show.jte", model("page", page));
//        });

        app.get("/index", ctx -> {
            var page = new Page("Main", "Opisanie");
            List<User> users = new ArrayList<>();
            users.add(new User("John", "Doe"));
            users.add(new User("John1", "Doe1"));

            var context = new UsersPage(users);
            var footerPage = new FooterPage("Desc", new User("Torkhov", "Nikita"));
            ctx.render("layout/page.jte", model("page", page, "footerPage", footerPage ,"context", context));
        });
        app.start(7070); // Стартуем веб-сервер
        //da
    }
}