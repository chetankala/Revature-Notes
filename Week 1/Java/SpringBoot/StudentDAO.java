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
}