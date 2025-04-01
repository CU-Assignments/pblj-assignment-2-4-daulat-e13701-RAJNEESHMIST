import  java.sql.*;
//in this jdbc example we retrieve data from the db
public class CRUD_operation {
    public static void main(String[] args) throws ClassNotFoundException{
//        now first step to load the driver related to the jdbc connection
//        which  are present inside the java.sql.* package in static block

//        these three credentials required to connect database
        String url = "jdbc:mysql://127.0.0.1:3306/school";
        String user = "root";
        String pass = "Anshu@299";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drive loaded Successfully...");
        }
        catch (ClassNotFoundException e){
            System.out.println("Driver not loaded : "+e.getMessage());
        }
//        forName method can through exception to classNotFound, so we have to handle it
//        next step to create connection
        try{
            Connection con = DriverManager.getConnection(url,user,pass);
            System.out.println("Connection established successfully..");

//            next step to create a statement
            Statement st = con.createStatement();
//            execute query and store the value in result set
//            int rowAffected = st.executeUpdate("INSERT INTO friends(id,name) VALUES (1,'Rajneesh Verma'),(2,'Varun Garg'),(3,'Arpit');");
//deleting record
//             int rowAffected = st.executeUpdate("delete from course where cid = 5 ;");
//            updating record
            int rowAffected = st.executeUpdate("update friends set name = 'Manisha Rebari' where id = 3");
            System.out.println(rowAffected+" rows affected.");
//

            st.close();
            con.close();
        }catch (SQLException e){
            System.out.println("Exception occur : "+e.getMessage());
        }
//        now we know that this line can through sqlException so we have to handle it
    }
}
