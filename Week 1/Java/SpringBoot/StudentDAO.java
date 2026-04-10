package StudentData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class StudentDAO implements InitializingBean, DisposableBean {
    static String driver;
    public static String getDriver() {
        return driver;
    }
    public static void setDriver(String driver) {
        System.out.println("Setting Driver");
        StudentDAO.driver = driver;
    }

    static Connection con;
    static String url;
    static String userName;
    static String password;

    public static Connection getConn() {
        return con;
    }
    public static void setConn(Connection con) {
        StudentDAO.con = con;
    }
    public static String getUrl() {
        return url;
    }
    public static void setUrl(String url) {
        System.out.println("Setting URL");
        StudentDAO.url = url;
    }
    public static String getUserName() {
        return userName;
    }
    public static void setUserName(String userName) {
        System.out.println("Setting User Name");
        StudentDAO.userName = userName;
    }
    public static String getPassword() {
        return password;
    }
    public static void setPassword(String password) {
        System.out.println("Setting Password");
        StudentDAO.password = password;
    }

    void init() throws ClassNotFoundException, SQLException {
        System.out.println("Initializing init method");
        createConnection();
    }
    static void createConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        con = DriverManager.getConnection(url, userName, password);
    }
    static void closeConnection() throws SQLException {
        con.close();
    }

    void getAllRecords() throws SQLException {
        String sql = "SELECT * FROM student";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            System.out.println("ID: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Age: " + rs.getInt(3), + " Course: " + rs.getString(4));
        }
    }
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside init method");
        createConnection();
    }
    public void destroy() throws Exception {
        System.out.println("Inside destroy method");
        closeConnection();
    }
}