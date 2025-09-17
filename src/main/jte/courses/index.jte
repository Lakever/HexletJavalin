@import org.example.hexlet.dto.courses.CoursesPage

@param CoursesPage page

@template.layout.page(
content = @`
    <form action="/courses" method="get">
    <input type="search" name="term" value="${page.getTerm()}" />
        <input type="search" name="desc" value="${page.getDesc()}" />
    <input type="submit" value="Search" />
</form>
    @for(var cors : page.getCourses())
        <div>${cors.getName()}</div>
    @endfor
`
,
footer = @`<p>FOOTER здесь</p>`
)