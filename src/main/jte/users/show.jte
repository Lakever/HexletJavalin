@import org.example.hexlet.dto.courses.UserPage
@param UserPage page

@template.layout.page(

content = @`
    <h2>${page.getUser().getFirstName()} ${page.getUser().getLastName()}</h2>
`,
footer = @`
    <p>Thanks for visiting, come again soon!</p>
`
)