@import org.example.hexlet.dto.courses.UsersPage
@param UsersPage page

@template.layout.page(
content = @`
    <a href="/users/build">"Главная страница"</a>
    @for(var user : page.getUsers())
        <div>${user.getLastName()}</div>
    @endfor
`
)