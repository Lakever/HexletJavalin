@import org.example.hexlet.dto.courses.UsersPage
@param UsersPage page

@template.layout.page(

content = @`
    <a href="#">New User</a>
    @for(var user : page.getUsers())
        <div>${user.getFirstName()} ${user.getLastName()}</div>
    @endfor
`,
footer = @`
    <p>Thanks for visiting, come again soon!</p>
`
)