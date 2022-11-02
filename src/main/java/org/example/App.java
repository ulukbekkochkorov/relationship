package org.example;


import org.example.entity.User;
import org.example.service.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudentServiceImpl userService = new StudentServiceImpl();
//        userService.saveUserTable(new User("Amir", "Asanov", 18l));
//        userService.dropUsersTable();
//        System.out.println(userService.getAllUser());
        userService.deleteById(1L);

    }
}
