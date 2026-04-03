// Java program to illustrate methods
// of Cookie class
import java.io.IOException;
import java.io.PrintWriter;
import javax.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieTest
 */
@WebServlet("/cookieTest")
public class cookieTest extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet()#HttpServlet()
     */
    public cookieTest() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet()#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        // Create a new cookie with the name test cookie
        // and value 123
        Cookie cookie = new Cookie("testCookie", "123");

        // setComment() method is used to set the comment for the cookie
        cookie.setComment("This is a test cookie");

        //setDomain() method is used to set the domain for the cookie
        cookie.setDomain("domain");

        //setMaxAge() method is used to set the maximum age of the cookie in seconds
        cookie.setMaxAge(3600);

        //setPath() method is used to set the path for the cookie
        cookie.setPath("/articles");

        //setSecure() method is used to set the secure flag for the cookie
        cookie.setSecure(false);

        //setValue()
        cookie.setValue("456");

        //setVersion()
        cookie.setVersion(0);

        // Add the cookie to the response
        response.addCookie(cookie);

        PrintWriter out = response.getWriter(); 
        out.println("<html><head></head><body>");
        Cookie ck[] = request.getCookies(); 

        if (ck == null){
            pw.print("<p>This is the first time this page is requested</p>");
            pw.print("<p>And therefore, no cookies found</p><body></html>");
        } else {
            pw.print("<p>Welcome Again...Cookies found</p>");
            for (int i = 0; i < ck.length; i++){

                // getName() method
                pw.print("<p>Name: " + ck[i].getName() + "</p>");
                
                // getValue() method
                pw.print("<p>Value: " + ck[i].getValue() + "</p>");

                // getDomain() method
                pw.print("<p>Domain: " + ck[i].getDomain() + "</p>");

                // getPath() method
                pw.print("<p>Path: " + ck[i].getPath() + "</p>");

                // getMaxAge() method
                pw.print("<p>Max Age: " + ck[i].getMaxAge() + "</p>");

                // getComment() method
                pw.print("<p>Comment: " + ck[i].getComment() + "</p>");

                // getSecure() method
                pw.print("<p>Secure: " + ck[i].getSecure() + "</p>");

                // getVersion() method
                pw.print("<p>Version: " + ck[i].getVersion() + "</p>");
            }
            pw.print("</body></html>");
        }
        pw.close();
    }
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}