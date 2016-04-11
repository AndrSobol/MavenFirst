package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Andrey on 01.04.2016.
 */
@WebServlet("/CheckUser")
public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        PrintWriter pw = response.getWriter();

        //Connection conn = getDBConnection();

        Connection conn = null;
        try {
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            //DriverManager.registerDriver(new oracle.);
        } catch (SQLException e) {
            e.printStackTrace();
            pw.println("ErrLine1 " + e.getMessage());
        }

        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","oracledb");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            pw.println("ErrLine2 " + e.getMessage());
        }

        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    private static Connection getDBConnection() {
        Connection dbConnection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            dbConnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","oracledb");
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dbConnection;
    }

}
