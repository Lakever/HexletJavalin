package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import static io.javalin.rendering.template.TemplateUtil.model;
import org.apache.commons.text.StringEscapeUtils;

import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.dto.courses.Page;

import org.example.hexlet.dto.courses.UserPage;
import org.example.hexlet.dto.courses.UsersPage;
import org.example.hexlet.model.Course;
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

            ctx.render("courses/index.jte", model("page", page));
        });

//        app.get("/users/{id}", ctx -> {
//            List<User> users = new ArrayList<>();
//            users.add(new User("John", "Doe"));
//            users.add(new User("John1", "Doe1"));
//            var id = ctx.pathParamAsClass("id", Integer.class).get();
//            users.get(id);
//
//            var escapedId = StringEscapeUtils.escapeHtml4(String.valueOf(id));
//            ctx.contentType("text/html");
//            ctx.result(escapedId);
//
//            var page = new UserPage(users.get(id));
//            ctx.render("users/users", model("page", page));
//        });

        app.get("/users/{id}", ctx -> {
            List<User> users = new ArrayList<>();
            users.add(new User("John", "Doe"));
            users.add(new User("John1", "Doe1"));
//            var id = ctx.pathParamAsClass("id", Integer.class).get();
            var id = ctx.pathParam("id");
//            var user = users.get(id);
            var escapedId = StringEscapeUtils.escapeHtml4(String.valueOf(id));
            ctx.contentType("text/html");

//            var page = new UserPage(user);
            ctx.result("<h1>" + escapedId + "</h1>");
//            ctx.render("users/show.jte", model("page", page));
        });

        app.get("users/", ctx -> {
            List<User> users = new ArrayList<>();
            users.add(new User("John", "Doe"));
            users.add(new User("John1", "Doe1"));


            var page = new UsersPage(users);
            ctx.render("users/users.jte", model("page", page));
        });

        app.get("/courses", ctx -> {
            var term = ctx.queryParam("term");
            var desc = ctx.queryParam("desc");
            List<Course> courses = new ArrayList<>();
            courses.add(new Course("English", "Learning English"));
            courses.add(new Course("German", "Learning German"));
            // Фильтруем, только если была отправлена форма
            if (term != null) {
                courses = courses.stream().filter(c -> c.getName()
                        .contains(term)).toList();
            }
            if (desc != null) {
                courses = courses.stream().filter(c -> c.getDescription()
                        .contains(desc)).toList();
            }
            var page = new CoursesPage(courses, term, desc);
            ctx.render("courses/index.jte", model("page", page));
        });

        app.start(7070); // Стартуем веб-сервер
        //da
    }
}