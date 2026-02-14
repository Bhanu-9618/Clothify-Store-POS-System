package service;

import model.dto.Employee;
import model.dto.Login;
import java.sql.SQLException;

public interface LoginPageService {
    Employee checkEmail(Login login) throws SQLException;
}
