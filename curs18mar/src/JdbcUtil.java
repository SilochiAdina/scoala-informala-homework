import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.err.println("Can't load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static Connection getConnection(String type, String host, String port, String dbName, String user, String pwd) {
        DriverManager.setLoginTimeout(60);
        String url = new StringBuilder()
                .append("jdbc:")
                .append(type)
                .append("://")
                .append(host)
                .append(":")
                .append(port)
                .append("/")
                .append(dbName)
                .append("?user=")
                .append(user)
                .append("&password=")
                .append(pwd).toString();
        System.out.println(url);
        try {
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Connection getConnection(String url) {
        try {
            DriverManager.setLoginTimeout(60);
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}