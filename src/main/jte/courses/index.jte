@import org.example.hexlet.dto.courses.FooterPage
@import org.example.hexlet.dto.courses.Page
@import gg.jte.Content
@import org.example.hexlet.dto.courses.UsersPage

@param FooterPage footerPage
@param Page page
@param UsersPage context

@template.layout.page(
page = page,
content = @`<p>${context.getUsers()}</p>`,  // Преобразуем UsersPage в Content
footer = @`<p>${footerPage.getDesc()}</p>`
)