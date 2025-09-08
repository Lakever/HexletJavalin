@import gg.jte.Content
@import org.example.hexlet.dto.courses.FooterPage
@import org.example.hexlet.dto.courses.Page
@import org.example.hexlet.dto.courses.UsersPage

@param Page page
@param Content content
@param FooterPage footer

<!DOCTYPE html>
<html lang="en">
<head>
    @if(page.getDescription() != null)
        <meta name="description" content="${page.getDescription()}">
    @endif
    <title>${page.getTitle()}</title>
</head>
<body>
<h1>${page.getTitle()}</h1>
<div class="content">
    ${content}
</div>
@if(footer != null)
    <div class="footer">
        ${footer.getDesc()}
    </div>
@endif
</body>
</html>