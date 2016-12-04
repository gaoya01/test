import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by gaoya on 2016/12/4.
 */
public class HelloWord extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("测试OK");

        String username=req.getParameter("username");
        String password=req.getParameter("password");

        System.out.println("用户名："+username);
        System.out.println("密码："+password);

    }
}
