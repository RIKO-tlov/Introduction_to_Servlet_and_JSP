import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.httpServletRequest;
import javax.servlet.httpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html; charset=UTF-8");
    printWriter out = response.getWriter();
    out.println("<html>");
    out.println("...");
    out.println("</html>");
  }
}