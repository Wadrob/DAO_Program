package main.java.pl.coderslab.entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class UserDao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean operator = true;

        while (operator){
            MENU();
            String option = scanner.nextLine();
            if (option.equalsIgnoreCase("create")){
                User new_user = User.createUser();
                DbUtil.createUser(new_user);
            }
             else if (option.equalsIgnoreCase("read")){
                 System.out.println("Read");
             }
             else if (option.equalsIgnoreCase("edit")){
                 System.out.println("Edit");
             }
             else if (option.equalsIgnoreCase("delete")){
                 System.out.println("Delete");
             }
             else if (option.equalsIgnoreCase("Read All")) {
                System.out.println("Read all");
            }
             else if (option.equalsIgnoreCase("Quit")){
                 System.out.println("Bye, bye");
                 break;
             }
             else {
                 System.out.println("Please choose again");
            }

        }
    }

    public static void MENU () {
        System.out.println("Please select option");
        System.out.println("");
        System.out.println("Create");
        System.out.println("Read USER by ID");
        System.out.println("Edit User");
        System.out.println("Delete User");
        System.out.println("Read All Users");
        System.out.println("Quit");
    }
}
