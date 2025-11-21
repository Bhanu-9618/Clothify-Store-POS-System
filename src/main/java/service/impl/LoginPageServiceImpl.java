package service.impl;

import model.dto.Employee;
import model.dto.Login;
import repository.LoginPageRepository;
import repository.impl.LoginPageRepositoryImpl;
import service.LoginPageService;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginPageServiceImpl implements LoginPageService {

    LoginPageRepository loginPageRepository = new LoginPageRepositoryImpl();

    @Override
    public Employee checkEmail(Login login) throws SQLException {
       ResultSet resultSet = loginPageRepository.checkByemail(login);

       if (!(resultSet ==null)){
           while (resultSet.next()){

           Employee employee = new Employee(
                   resultSet.getLong("employeeId"),
                   resultSet.getString("contact"),
                   resultSet.getString("email"),
                   resultSet.getString("gender"),
                   resultSet.getString("name"),
                   resultSet.getString("password"),
                   resultSet.getString("role")
           );
           return employee;
       }
       }
        return null;
    }
}
