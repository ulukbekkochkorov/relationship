package org.example;


import org.example.entity.User;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserServiceImpl userService = new UserServiceImpl();
//        userService.saveUserTable(new User("Amir", "Asanov", 18l));
//        userService.dropUsersTable();
//        System.out.println(userService.getAllUser());
        userService.deleteById(1L);

    }
}
