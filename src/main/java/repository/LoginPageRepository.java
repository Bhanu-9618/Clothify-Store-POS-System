package repository;

import model.dto.Login;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface LoginPageRepository {
    ResultSet checkByemail(Login login) throws SQLException;
}
