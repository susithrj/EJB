//package MDBean;
//
//
//import javax.annotation.Resource;
//import javax.jms.*;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet(urlPatterns = {"/MyServlet"})
//public class MDBServlet extends HttpServlet {
//
//    @Resource(mappedName = "demo/susith")
//    private Queue demoQ;
//    @Resource(mappedName = "demo/susithFac")
//    private ConnectionFactory cnnFactory;
//
//
//    public void doGet(HttpServletRequest req, HttpServletResponse resp){
//        try {
//            PrintWriter out = resp.getWriter();
//            out.println("Demo");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    private  void senJMSMessageToSusith(String messegeData){
//        Connection conn = demoQ.createConnection;
//        try {
//            Session S = conn.createSession();
//        } catch (JMSException e) {
//            e.printStackTrace();
//        }
//        MessageProducer mp = S.createProducer(susith);
//        TextMessage tm = S.createTextMessage();
//        tm.setText(messegeData);
//        mp.send(tm);
//    }
//
//
//}
