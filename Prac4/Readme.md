4.2 Displaying Date in Servlet
------------------------------
In this example we are going to show how we can display a current date and time on our browser. It is very easy to display it on our browser by using the Date class of the java.util package.

4.4 A Holistic counter in Servlet
---------------------------------
In this program we are going to make a such a servlet which will count the number of times it has been accessed and the number of threads created by the server.
In this example firstly we are going to create one class named as HolisticCounterInServlet. Now declare a variable counter of int with initial value 0, the value of this counter will be different for each servlet and create a Hashtable object. This object will be shared by all the threads in the container. Inside the doGet() method use the method getWriter() method of the response object which will return the PrintWriter object. 

4.8 Dice Roller
---------------
We are going to make one program on the dice roller in which the number in the dice will be selected randomly.
To make a program over this firstly we need to make a class DiceRoller in which we will have a doGet() method in which we will have our application logic. To make the dice working randomly use the random() method of the class java.lang.Math. To print the number on the browser call the method getWriter() of the response object which will return the PrintWriter object. Now by the object of the PrintWriter class print the values of the dice on the browser. 

4.12 Time Updater in Servlet
----------------------------
In this program we are going to make one program on servlet which will keep on updating the time in every second and the result will be displayed to you.
To make this servlet firstly we need to make a class named TimeUpdater.  The name of the class should be such that it becomes easy to understand what the program is going to do. Call the method getWriter() method of the response object which will return a PrintWriter object. Use the method getHeader() of the response object to add a new header. We can also use setHeader() in place of getHeader(). The setHeader() method overrides the previous set header. Now by using the PrintWriter object display the result on the browser.

4.13 Send Redirect in Servlet
-----------------------------
When we want that someone else should handle the response of our servlet, then there we should use sendRedirect() method.
In send Redirect whenever the client makes any request it goes to the container, there the container decides whether the concerned servlet can handle the request or not. If not then the servlet decides that the request can be handle by other servlet or jsp. Then the servlet calls the sendRedirect() method of the response object and sends back the response to the browser along with the status code. Then the browser sees the status code and look for that servlet which can now handle the request. Again the browser makes a new request, but with the name of that servlet which can now handle the request and the result will be displayed to you by the browser. In all this process the client is unaware of the processing.
In this example we are going to make one html in which we will submit the user name and his password. The controller will check if the password entered by the user is correct or not. If the password entered by the user is correct then the servlet will redirect the request to the other servlet which will handle the request. If the password entered by the user is wrong then the request will be forwarded to the html form.

4.16 Session Last Accessed Time Example
---------------------------------------
This example illustrates to find current  access time of session  and last access time of session. Sessions are used to maintain state and user identity across multiple page requests. An implementation of HttpSession represents the server's view of the session. The server considers a session to be new until it has been joined by the client. Until the client joins the session, isNew() method returns true.

4.19 Inserting Data In Database table using Statement
-----------------------------------------------------
In this program we are going to insert the data in the database from our java program in the table stored in the database.
To accomplish our goal we first have to make a class named as ServletInsertingData, which must extends the abstract HttpServlet class, the name of the class should be such that other person can understand what this program is going to perform. The logic of the program will be written inside the doGet() method that takes two arguments, first is HttpServletRequest interface and the second one is the HttpServletResponse interface and this method can throw ServletException.
Inside this method call the getWriter() method of the PrintWriter class. We can insert the data in the database only and only if there is a connectivity between our database and the java program. To establish the connection between our database and the java program we first need to call the method forName(), which is static in nature of the class Class. It takes one argument which tells about the database driver we are going to use. Now use the static method getConnection() of the DriverManager class. This method takes three arguments and returns the Connection object. SQL statements are executed and  results are returned within the context of a connection. Now your connection has been established. Now use the method createStatement() of the Connection object which will return the Statement object. This object is used for executing a static SQL statement and obtaining the results produced by it. We have to insert a values into the table so we need to write a query for inserting the values into the table. This query we will write inside the executeUpdate() method of the Statement object. This method returns int value.
If the record will get inserted in the table then output will show "record has been inserted"  otherwise "sorry! Failure".

4.20 Retrieving Data from the table using Statement
---------------------------------------------------
In this program we are going to fetch the data from the database in the table from our java program.
 
To accomplish our goal we first have to make a class named as ServletFetchingData which must extends the abstract HttpServlet class, the name of the class should be such that the other person can understand what this program is going to perform. The logic of the program will be written inside the doGet() method which takes two arguments, first is HttpServletRequest interface and the second one is the HttpServletResponse interface and this method can throw ServletException.
Inside this method call the getWriter() method of the PrintWriter class. We can retrieve the data from the database only and only if there is a connectivity between our database and the java program. To establish the connection between our database and the java program we firstly need to call the method forName() which is static in nature of the class ClassLoader. It takes one argument which tells about the database driver  we are going to use. Now use the static method getConnection() of the DriverManager class. This method takes three arguments and returns the Connection object. SQL statements are executed and  results are returned within the context of a connection. Now your connection has been established. Now use the method createStatement() of the Connection object which will return the Statement object. This object is used for executing a static SQL statement and obtaining the results produced by it. As we need to retrieve the data from the table so we need to write a query to select all the records from the table. This query will be passed in the executeQuery() method of Statement object, which returns the ResultSet object. Now the data will be retrieved by using the getString() method of the ResultSet object.

4.21 Inserting data from the HTML page to the database
------------------------------------------------------
In this program we are going to make program in which we are going to insert the values in the database table from the html form.
To make our program working we need to make one html form in which we will have two fields, one is for the name and the other one  is for entering the password. At last we will have the submit form, clicking on which the values will be passed to the server.
The values which we have entered in the Html form will be retrieved by the server side program which we are going to write. To accomplish our goal we first have to make a class named as ServletInsertingDataUsingHtml which must extends the abstract HttpServlet class, the name of the class should be such that the other person can understand what this program is going to perform. The logic of the program will be written inside the doGet() method which takes two arguments, first is HttpServletRequest interface and the second one is the HttpServletResponse interface and this method can throw ServletException.
Inside this method call the getWriter() method of the PrintWriter class. We can insert the data in the database only and only if there is a connectivity between our database and the java program. To establish the connection between our database and the java program we firstly need to call the method forName() which is static in nature of the class Class. It takes one argument which tells about the database driver  we are going to use. Now use the static method getConnection() of the DriverManager class. This method takes three arguments and returns the Connection object. SQL statements are executed and  results are returned within the context of a connection. Now your connection has been established. Now use the method prepareStatement() of the Connection object which will return the PreparedStatement object and takes one a query which we want to fire as its input. The values which we have got from the html will be set in the database by using the setString() method of the PreparedStatement object.
If the record will get inserted in the table then output will show "record has been inserted"  otherwise "sorry! Failure".

4.22 Retrieving Data from the table using (PreparedStatement)
-------------------------------------------------------------
In this program we are going to fetch the data from the database in the table from our java program using PreparedStatement. 
To accomplish our goal we first have to make a class named as ServletFetchingDataFromDatabase which must extends the abstract HttpServlet class, the name of the class should be such that the other person can understand what this program is going to perform. The logic of the program will be written inside the doGet() method which takes two arguments, first is HttpServletRequest interface and the second one is the HttpServletResponse interface and this method can throw ServletException.
Inside this method call the getWriter() method of the PrintWriter class. We can retrieve the data from the database only and only if there is a connectivity between our database and the java program. To establish the connection between our database and the java program we firstly need to call the method forName() which is static in nature of the class ClassLoader. It takes one argument which tells about the database driver  we are going to use. Now use the static method getConnection() of the DriverManager class. This method takes three arguments and returns the Connection object. SQL statements are executed and  results are returned within the context of a connection. Now your connection has been established. Now use the method prepareStatement() of the Connection object which will return the PreparedStatement object and takes a query as its parameter. In this query we will write the task we want to perform. The Resultset object will be retrieved by using the executeQuery() method of the PreparedStatement object. Now the data will be retrieved by using the getString() method of the ResultSet object.
