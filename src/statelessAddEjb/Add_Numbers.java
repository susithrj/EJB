package statelessAddEjb;

import javax.ejb.EJB;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Add_Numbers extends HttpServlet {
    @EJB
    AddEjb obj;
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        //int sum = num1 + num2;
       // statelessAddEjb.AddBean obj = new statelessAddEjb.AddBean();
        obj.setI(num1);
        obj.setJ(num2);

        obj.add();
        int sum = obj.getK();

      //  int product = num1 * num2;
        PrintWriter output = response.getWriter();
        output.println("The Answer is using ejb bean :"+sum );
    }
}
