package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursesPage;
public final class JteshowGenerated {
	public static final String JTE_NAME = "courses/show.jte";
	public static final int[] JTE_LINE_INFO = {1,1,2,2,2,4,4,6,6,6,7,7,7,8,8,8,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n<main>\n    <h1>");
		jteOutput.setContext("h1", null);
		jteOutput.writeUserContent(page.getCourses().get(0).getName());
		jteOutput.writeContent("</h1>\n    <p>");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(page.getCourses().get(0).getDescription());
		jteOutput.writeContent("</p>\n</main>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
