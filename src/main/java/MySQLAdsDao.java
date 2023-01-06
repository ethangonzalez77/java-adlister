import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads{

    private Connection connection;


    public MySQLAdsDao() throws SQLException {

    }



    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    }










    @Override
    public List<Ad> all() throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from ads");
        List<Ad> Ad = new ArrayList<>();
        while (rs.next()) {
            Ad.add(
                    new Ad(
                            (long) rs.getInt("ads_id"),
                            (long) rs.getInt("users_id"),
                            rs.getString("title"),
                            rs.getString("description")
                    )
            );
        }
        return Ad;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        String title = ad.getTitle();
        String desc = ad.getDescription();
        String query = "INSERT INTO ads (users_id, title, description) VALUES (1, '"  + title + "', '" + desc + "')";
        Statement statement = connection.createStatement();
        statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = statement.getGeneratedKeys();
        rs.next();
        System.out.println("rs.getLong(1) = " + rs.getLong(1));
        return rs.getLong(1);
    }
}
