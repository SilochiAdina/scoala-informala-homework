import java.sql.*;

/**
 * Facem conexiune intre MySql si Java, aici am importat datele din Mysql si am facut conexiunea pentru a recunoaste DB
 */
public class Jdbc {

        public static void main(String[] args) {


            Connection connection = JdbcUtil.getConnection(
                    "jdbc:mysql://localhost:3306/books?user=root&password=123456");

            if (connection == null) return;
            Statement st = null;
            ResultSet rs = null;
            final String format = "%20s%20s%12s\n";
            try {
                st = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                rs = st.executeQuery("select * from authors");
                boolean hasResults = rs.next();
                if (hasResults) {
                    System.out.format(format, "Name", "Email", "Birthdate");
                    do {
                        System.out.format(format, rs.getString("name"), rs.getString("email"), rs.getDate("birthdate"));
                    } while (rs.next());
                } else {
                    System.out.println("No results");
                }
            } catch (SQLException e) {
                System.err.println("Cannot execute query: " + e.getMessage());
            } finally {
                if (rs != null) try {
                    rs.close();
                } catch (SQLException e) {
                }
                if (st != null) try {
                    st.close();
                } catch (SQLException e) {
                }



                if (connection == null)
                    return;

                PreparedStatement ps = null;
                try {
                    ps = connection.prepareStatement("insert into authors (name , email, birthdate) values (?, ?, ?)");
                    ps.setString(1, "Anton Ioana \n");
                    ps.setString(2, " anton.ioana@gmail.de");
                    ps.setDate(3, java.sql.Date.valueOf("1982-11-23"));
                    ps.executeUpdate();
                } catch (SQLException e) {
                    System.err.println("Cannot insert author: " + e.getMessage());
                } finally {
                    if (ps != null) try {
                        ps.close();
                    } catch (SQLException e) {
                    }
                }

            }

        }
}
