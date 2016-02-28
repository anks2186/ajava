
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/ServletInsertingData")
public class ServletInsertingData extends HttpServlet{
	final String JDBC_DRIVER = "org.postgresql.Driver";
	
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, 
  HttpServletResponse response)throws 
  ServletException, IOException{  
  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
   final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/s2c130050131051";


   final String USER = "postgres";
   final String PASS = "harshpanchal";

  Connection conn;
  ResultSet rs;
  try{
  Class.forName("org.postgresql.Driver");
  conn = DriverManager.getConnection(DB_URL, USER, PASS);
  Statement statement = conn.createStatement();
  String query = "insert into registration values(55,'hp', 'cse')";
  int i = statement.executeUpdate(query);
  if(i!=0){
  out.println("The record has been inserted");
  }
  else{
  out.println("Sorry! Failure");
  }
  rs = statement.executeQuery("select * from registration");
  while(rs.next()){
  out.println("<p><table>" + rs.getInt(1) + " " 
  + rs.getString(2) + " "+rs.getString(3)+"</p></table>");
  }
  rs.close();
  statement.close();
  }
  catch (Exception e){
  System.out.println(e);
  }
  }
}