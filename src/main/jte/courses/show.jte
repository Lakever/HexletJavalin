<!-- src/main/jte/courses/show.jte -->
@import org.example.hexlet.dto.courses.CoursesPage
@param CoursesPage page

<!-- Для наглядности мы не стали включать сюда основную структуру HTML -->
<main>
    <h1>${page.getCourses().get(0).getName()}</h1>
    <p>${page.getCourses().get(0).getDescription()}</p>
</main>