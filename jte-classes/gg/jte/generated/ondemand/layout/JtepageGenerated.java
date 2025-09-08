package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
import org.example.hexlet.dto.courses.Page;
public final class JtepageGenerated {
	public static final String JTE_NAME = "layout/page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,10,10,10,11,11,11,11,11,11,11,11,11,12,12,13,13,13,16,16,16,18,18,18,20,20,22,22,22,24,24,26,26,26,3,4,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Page page, Content content, Content footer) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    ");
		if (page.getDescription() != null) {
			jteOutput.writeContent("\n        <meta name=\"description\"");
			var __jte_html_attribute_0 = page.getDescription();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
				jteOutput.writeContent(" content=\"");
				jteOutput.setContext("meta", "content");
				jteOutput.writeUserContent(__jte_html_attribute_0);
				jteOutput.setContext("meta", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n    ");
		}
		jteOutput.writeContent("\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(page.getTitle());
		jteOutput.writeContent("</title>\n</head>\n<body>\n<h1>");
		jteOutput.setContext("h1", null);
		jteOutput.writeUserContent(page.getTitle());
		jteOutput.writeContent("</h1>\n<div class=\"content\">\n    ");
		jteOutput.setContext("div", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\n</div>\n");
		if (footer != null) {
			jteOutput.writeContent("\n    <div class=\"footer\">\n        ");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(footer);
			jteOutput.writeContent("\n    </div>\n");
		}
		jteOutput.writeContent("\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Page page = (Page)params.get("page");
		Content content = (Content)params.get("content");
		Content footer = (Content)params.get("footer");
		render(jteOutput, jteHtmlInterceptor, page, content, footer);
	}
}
