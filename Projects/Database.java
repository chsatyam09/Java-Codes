

// --------------------------------------------------------------------------------------------
//1. connect your IDE with Database using Necessary Connector i.e. jar file import karwa dia already 

// Class.forName("com.mysql.cj.jdbc.Driver");  //2. Load Necessary Drivers

 // Connection connection = DriverManager.getConnection(url, username, password);  // 3.Create Connections
//  private static final String url = "jdbc:mysql://localhost:3306/mydb "; // 3.Create Connections
//  private static final String username = "root" ; //3. Create Connections
//  private static final String password = "chsatyam09"; // 3. Create Connections



// Statement statement = connection.createStatement(); // 4 . Create Statements


// String query = String.format("UPDATE STUDENT_DETAILS SET ROLL_NO = %d WHERE STUD_ID = %d", 50, 50);  // 5.Execute SQL Query
// String query = "select * from student_details" ;  // 5.Execute SQL Query
//  String query = String.format("INSERT INTO STUDENT_DETAILS(STUD_ID, NAME, ROLL_NO, PHONE_NO, CLASS) VALUES (%d, '%s', %d, %d, '%s')", 50, "Ankul", 001, 111, "cse");  // 5.Execute SQL Query


// --------------------------------------------------------------------------------------------
// Intellij IDE 

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;

// public class Database {

//     public static void main(String[] args) {
//         // Database url
//         String url = "jdbc:mysql://localhost:3306/school";

//         // Database credentials
//         String username = "root";
//         String password = "chsatyam09";

//         // Establish the connection
//         try {
//             Connection connection = DriverManager.getConnection(url, username, password);
//             System.out.println("Connected to the Database");

//             // perform Database operation here
//             // For example:
//             // Statement statement = connection.createStatement();
//             // ResultSet resultSet = statement.executeQuery("SELECT * FROM your_table");

//             // Don't forget to close the connection when done
//             connection.close();
//         } catch (SQLException e) {
//             System.err.println("Connection failed: " + e.getMessage());
//         }
//     }
// }

// --------------------------------------------------------------------------------------------

// vscode 

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.Statement;
// import javax.swing.JOptionPane;

// public class Database {
    
//     public static void main(String[] args) throws Exception {
//         try {
//             String url = "jdbc:mysql://localhost:3306/";

//             String databaseName = "school";
//             String userName = "root";
//             String password = "chsatyam09";
    
//             Connection connection = DriverManager.getConnection(url,userName, password);
    
//             String sql = "CREATE DATABASE " + databaseName;
    
//             Statement statement = connection.createStatement();
//             statement.executeUpdate(sql);
//             statement.close();
//             JOptionPane.showMessageDialog(null, databaseName + " Database has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
    
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }


// --------------------------------------------------------------------------------------------


// import java.sql.*;

//  class Jdbc {
//     public static void main(String[] args) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//          //   com.mysql.cj iskeaandr jdbc ke  driver pade hue hai
//           //  System.out.println("MySQL JDBC Driver Registered!");
//         } catch (ClassNotFoundException e) {
//             System.out.println(e.getMessage());
//           //  System.out.println("Error: MySQL JDBC Driver not found!");
           
//         }
//     }
// }


// --------------------------------------------------------------------------------------------
// import java.sql.*;

//  class Jdbc {


//      private static final String url = "jdbc:mysql://localhost:3306/?user=root ";
//      // static -  ye bana hai main ke bahar main mehtod hai static
//      // jab bhi hum static member se non static member ko access/use karne ki kosis karte hai
//      // tooh error aata hai , to solve error either you make object of non static member
//      // or  make non static to static .

//    //  fianl - we don't  want to  change the url , username or password



//      private static final String username = "root " ;

//      private static final string password = "chastyam09 ";




//      public static void main(String[] args) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");

//         } catch (ClassNotFoundException e) {
//             System.out.println(e.getMessage());


//         }
//     }
// }

// --------------------------------------------------------------------------------------------

// import java.sql.*;

//  class Jdbc {


//      private static final String url = "jdbc:mysql://localhost:3306/?user=root ";
//      private static final String username = "root" ;

//      private static final String password = "chastyam09";


//      public static void main(String[] args) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");

//         } catch (ClassNotFoundException e) {
//             System.out.println(e.getMessage());


//         }

//         try{
//             Connection connection = DriverManager.getConnection(url,username, password);
//             Statement statement = connection.createStatement();

//         }catch (SQLException e  ){
//             System.out.println(e.getMessage());

//         }

//     }
// }

// --------------------------------------------------------------------------------------------
// Data  Retrivel from mysql to Intellij IDE 
// --------------------------------------------------------------------------------------------
// import java.sql.*;

//  class Jdbc {


//      private static final String url = "jdbc:mysql://localhost:3306/mydb ";
//      private static final String username = "root" ;

//      private static final String password = "chsatyam09";


//      public static void main(String[] args) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");

//         } catch (ClassNotFoundException e) {
//             System.out.println(e.getMessage());


//         }

//         try{
//             Connection connection = DriverManager.getConnection(url,username, password);
//             Statement statement = connection.createStatement();
//             String query = "select * from student_details" ;
//             ResultSet resultSet = statement.executeQuery(query);

//             while(resultSet.next()){
//                 int STUD_ID = resultSet.getInt("STUD_ID");
//                 String NAME = resultSet.getString("NAME");
//                 int ROLL_NO = resultSet.getInt("ROLL_NO");
//                 int PHONE_NO = resultSet.getInt("PHONE_NO");
//                 String CLASS = resultSet.getString("CLASS");
//                 System.out.println(  " Student ID"+STUD_ID );
//                 System.out.println(  " Name "+NAME );
//                 System.out.println(  " Roll"+ROLL_NO );
//                 System.out.println(  " Phone"+PHONE_NO );
//                 System.out.println(  " Class"+CLASS );
//                 System.out.println("--------------------");


//             }

//         }catch (SQLException e  ){
//             System.out.println(e.getMessage());

//         }



//     }
// }

// --------------------------------------------------------------------------------------------
// Data  Inserting using Intellij IDE to mysql database 
// --------------------------------------------------------------------------------------------

// import java.sql.*;

//  class Jdbc {


//      private static final String url = "jdbc:mysql://localhost:3306/mydb ";
//      private static final String username = "root" ;

//      private static final String password = "chsatyam09";


//      public static void main(String[] args) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");

//         } catch (ClassNotFoundException e) {
//             System.out.println(e.getMessage());


//         }

//          try {
//              Connection connection = DriverManager.getConnection(url, username, password);
//              Statement statement = connection.createStatement();
//              String query = String.format("INSERT INTO STUDENT_DETAILS(STUD_ID, NAME, ROLL_NO, PHONE_NO, CLASS) VALUES (%d, '%s', %d, %d, '%s')", 50, "Ankul", 001, 111, "cse");
//              int rowsAffected = statement.executeUpdate(query);

//              if (rowsAffected > 0) {
//                  System.out.println("Data inserted successfully");
//              } else {
//                  System.out.println("Data not inserted");
//              }

//          } catch (SQLException e) {
//              System.out.println(e.getMessage());
//          }
         
//     }
// }
// --------------------------------------------------------------------------------------------
// Data  updation using Intellij IDE to mysql database 
// --------------------------------------------------------------------------------------------

// import java.sql.*;

//  class Jdbc {


//      private static final String url = "jdbc:mysql://localhost:3306/mydb ";
//      private static final String username = "root" ;

//      private static final String password = "chsatyam09";


//      public static void main(String[] args) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");

//         } catch (ClassNotFoundException e) {
//             System.out.println(e.getMessage());


//         }

//          try {
//              Connection connection = DriverManager.getConnection(url, username, password);
//              Statement statement = connection.createStatement();
//              String query = String.format("UPDATE STUDENT_DETAILS SET ROLL_NO = %d WHERE STUD_ID = %d", 50, 50);
//              int rowsAffected = statement.executeUpdate(query);

//              if (rowsAffected > 0) {
//                  System.out.println("Data updated successfully");
//              } else {
//                  System.out.println("Data not updated");
//              }

//          } catch (SQLException e) {
//              System.out.println(e.getMessage());
//          }


//     }
// }

// --------------------------------------------------------------------------------------------
// Data  Deletion suding Intellij ide from mysql databse 
// --------------------------------------------------------------------------------------------
// import java.sql.*;

//  class Jdbc {

// //1. connect your IDE with Database using Necessary Connector i.e. jar file import karwa dia already
//      private static final String url = "jdbc:mysql://localhost:3306/mydb "; // 3.Create Connections
//      private static final String username = "root" ; //3. Create Connections

//      private static final String password = "chsatyam09"; // 3. Create Connections


//      public static void main(String[] args) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");  //2. Load Necessary Drivers

//         } catch (ClassNotFoundException e) {
//             System.out.println(e.getMessage());


//         }

//          try {
//              Connection connection = DriverManager.getConnection(url, username, password);  // 3.Create Connections
//              Statement statement = connection.createStatement(); // 4 . Create Statements
//              String query ="DELETE FROM STUDENT_DETAILS WHERE STUD_ID=199";  // 5.Execute SQL Query
//              int rowsAffected = statement.executeUpdate(query);

//              if (rowsAffected > 0) {
//                  System.out.println("Data Deletion successfully");
//              } else {
//                  System.out.println("Data not Deleted");
//              }

//          } catch (SQLException e) {
//              System.out.println(e.getMessage());
//          }


//     }
// }


// --------------------------------------------------------------------------------------------
// prepared statements  Data  Inserting using Intellij IDE to mysql database 
// --------------------------------------------------------------------------------------------
// import java.sql.*;

//  class Jdbc {

// //1. connect your IDE with Database using Necessary Connector i.e. jar file import karwa dia already
//      private static final String url = "jdbc:mysql://localhost:3306/mydb "; // 3.Create Connections
//      private static final String username = "root" ; //3. Create Connections

//      private static final String password = "chsatyam09"; // 3. Create Connections


//      public static void main(String[] args) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");  //2. Load Necessary Drivers

//         } catch (ClassNotFoundException e) {
//             System.out.println(e.getMessage());


//         }

//          try {
//              Connection connection = DriverManager.getConnection(url, username, password);
//              String query = "INSERT INTO STUDENT_DETAILS(STUD_ID, NAME, ROLL_NO, PHONE_NO, CLASS) VALUES (?, ?, ?, ?, ?)";
//              PreparedStatement preparedStatement = connection.prepareStatement(query);
//              preparedStatement.setInt(1, 24); // Set STUD_ID
//              preparedStatement.setString(2, "ram"); // Set NAME
//              preparedStatement.setInt(3, 9); // Set ROLL_NO
//              preparedStatement.setInt(4, 190); // Set PHONE_NO
//              preparedStatement.setString(5, "ece"); // Set CLASS

//              int rowsAffected = preparedStatement.executeUpdate();

//              if (rowsAffected > 0) {
//                  System.out.println("Data inserted successfully");
//              } else {
//                  System.out.println("Data not inserted");
//              }

//          } catch (SQLException e) {
//              System.out.println(e.getMessage());
//          }



//      }
// }

// --------------------------------------------------------------------------------------------
// prepared statements   Data  retrivel using Intellij IDE to mysql database 
// --------------------------------------------------------------------------------------------
// import java.sql.*;

//  class Jdbc {

// //1. connect your IDE with Database using Necessary Connector i.e. jar file import karwa dia already
//      private static final String url = "jdbc:mysql://localhost:3306/mydb "; // 3.Create Connections
//      private static final String username = "root" ; //3. Create Connections

//      private static final String password = "chsatyam09"; // 3. Create Connections


//      public static void main(String[] args) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");  //2. Load Necessary Drivers

//         } catch (ClassNotFoundException e) {
//             System.out.println(e.getMessage());


//         }

//          try {
//              Connection connection = DriverManager.getConnection(url, username, password);
//              String query = "SELECT ROLL_NO  FROM STUDENT_DETAILS WHERE STUD_ID = ?" ;
//              PreparedStatement preparedStatement = connection.prepareStatement(query);
//              preparedStatement.setInt(1,24);





//              ResultSet resultSet = preparedStatement.executeQuery();
//              if (resultSet.next()){
//                  int R0LL_NO =  resultSet.getInt("ROLL_NO");
//                  System.out.println("ROLL:" + R0LL_NO);
//              }
//              else {
//                  System.out.println("ROLL number not found ");
//              }

//          } catch (SQLException e) {
//              System.out.println(e.getMessage());
//          }



//      }
// }

// --------------------------------------------------------------------------------------------
// Batch processig 
// --------------------------------------------------------------------------------------------
// import java.sql.*;
// import java.util.Scanner;

// class Jdbc {

// //1. connect your IDE with Database using Necessary Connector i.e. jar file import karwa dia already
//      private static final String url = "jdbc:mysql://localhost:3306/mydb "; // 3.Create Connections
//      private static final String username = "root" ; //3. Create Connections

//      private static final String password = "chsatyam09"; // 3. Create Connections


//      public static void main(String[] args) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");  //2. Load Necessary Drivers

//         } catch (ClassNotFoundException e) {
//             System.out.println(e.getMessage());


//         }

//          try {
//              Connection connection = DriverManager.getConnection(url, username, password);
//              Statement statement = connection.createStatement();
//              Scanner scanner = new Scanner(System.in);
//              while (true) {
//                  System.out.println("Enter Stud_id:");
//                  int Stud_id = scanner.nextInt();
//                  System.out.println("Enter Name:");
//                  String name = scanner.next();
//                  System.out.println("Enter Roll_No:");
//                  int roll_no = scanner.nextInt();
//                  System.out.println("Enter phone_NO:");
//                  int phone_no = scanner.nextInt();
//                  System.out.println("Enter class:");
//                  String studentClass = scanner.next(); // Changed variable name from "class" to "studentClass"
//                  System.out.println("Enter more data(Y/N)");
//                  String choice = scanner.next();
//                  String query = String.format("INSERT INTO STUDENT_DETAILS(STUD_ID, NAME, ROLL_NO, PHONE_NO, CLASS) VALUES (%d, '%s', %d, %d, '%s')", Stud_id, name, roll_no, phone_no, studentClass);
//                  statement.addBatch(query);
//                  if (choice.toUpperCase().equals("N")) {
//                      break;
//                  }
//              }

//              int[] rowsAffected = statement.executeBatch();
//              if (rowsAffected.length > 0) {
//                  System.out.println("Data inserted successfully");
//              } else {
//                  System.out.println("No data inserted");
//              }

//          } catch (SQLException e) {
//              System.out.println(e.getMessage());
//          }
//      }
// }


// --------------------------------------------------------------------------------------------
// Transaction Handling 
// --------------------------------------------------------------------------------------------