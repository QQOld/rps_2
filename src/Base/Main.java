package Base;

import Base.DAO.*;
import Base.Model.User;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Dao.initConn();

        //User user1 = new User(20, "Вася", "Пупкин", "Мужской", "+79102832643");
        //UserDAO.insert(user1);

        ArrayList users = UserDAO.getAllUsers();

        User user1 = (User) users.get(2);
        user1.setAge(25);
        UserDAO.update((User) users.get(2));

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }

}
