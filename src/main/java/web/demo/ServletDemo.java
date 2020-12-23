package web.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.val;
import org.jetbrains.annotations.NotNull;

@WebServlet("/demo")
public class ServletDemo extends HttpServlet {

  @Override
  @SneakyThrows
  protected void doGet(HttpServletRequest req, @NotNull HttpServletResponse resp) {
    resp.setContentType("application/json");
    @Cleanup val writer = resp.getWriter();
    writer.println("{\"Hello\": \"World!\"}");
  }
}
