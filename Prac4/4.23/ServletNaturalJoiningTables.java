import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
@WebServlet("/ServletNaturalJoiningTables")

public class ServletNaturalJoiningTables extends HttpServlet{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.postgresql.Driver";
	static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/s2c130050131051";

	//  Database credentials
	static final String USER = "postgres";
	static final String PASS = "harshpanchal";
	   
	public void init() throws ServletException{
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		Connection conn = null;
	    PreparedStatement pstmt = null;
		try{
			System.out.println("Enrollno: 130050131051");
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");
			
		    
			//STEP 2: Executing query
		    String sql = "SELECT id,name,bname from registration inner join student on registration.name=contactinfo.name";
		    pstmt = conn.prepareStatement(sql);
		 
		    ResultSet rs = pstmt.executeQuery();
			rs = stmt.executeQuery(query);
			while (rs.next())
			{
				out.println("<h5>"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"<h5>");
			}
	            
		}catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(pstmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	public void destroy(){
		
	}
  
}