@import org.example.hexlet.dto.courses.Page

@param Page page

@template.layout.page(
page = page,
content = @`<p>CONTENT</p>`,
footer = @`<p>FOOTER здесь</p>`
)