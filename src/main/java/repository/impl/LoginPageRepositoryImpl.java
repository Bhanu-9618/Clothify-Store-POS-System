package repository.impl;

import db.DBConnection;
import model.dto.Login;
import repository.LoginPageRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginPageRepositoryImpl implements LoginPageRepository {

    @Override
    public ResultSet checkByemail(Login login) throws SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String Sql = "SELECT * FROM employee WHERE email = ? AND password = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(Sql);
        preparedStatement.setObject(1,login.getEmail());
        preparedStatement.setObject(2,login.getPassword());

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet == null){
            return null;
        }
        return resultSet;
    }
}
