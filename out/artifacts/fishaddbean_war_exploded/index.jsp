<%@ page import="Stafulone.ListElementsRemote" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="Stafulone.ListElements" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%!
  private static ListElementsRemote values;
  public void jspInit(){
      try {
        InitialContext ic = new InitialContext();

        values = (ListElementsRemote) ic.lookup("java:global/fishaddbean/Stafulone /ListElements");
        System.out.println("values:"+values);
      } catch (Exception e){
        System.out.println(e);
      }
  }

%>
<%
  if(request.getParameter("addNum") != null){
      int e = Integer.parseInt(request.getParameter("t1"));
      values.addElement(e);
  }
   if(request.getParameter("remNum") != null){
       int e = Integer.parseInt(request.getParameter("t1"));
       values.removeElement(e);
   }
%>
<html>
  <head>
    <title>susith JSP</title>
  </head>
  <body>
  <h1>Welcome</h1>
  <form name="abc" method="post" >
    <input type="text" name="t1"/> <br>
    <input type="submit" value="Add" name="addNum"/> <br>
    <input type="submit" value="Remove" name="remNum"/> <br>
      <%
      if(values != null){
        List<Integer> nums = values.getElements();
        for(int value : nums) {
            out.println("<br>" + value);
        }
        out.println("<br> Size = " + nums.size());
      }
      %>

  </form>
  </body>
</html>
