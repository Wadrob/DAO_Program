package main.java.pl.coderslab.entity;

import java.util.Scanner;

public class User {

    protected int id;
    protected String Username;
    protected String email;
    protected String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static User createUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("Proszę podać login");
        String username = scan.nextLine();
        System.out.println("Proszę podać email");
        String email = scan.nextLine();
        System.out.println("Proszę podać hasło");
        String password = scan.nextLine();
        User user = new User();
        user.setPassword(password);
        user.setUsername(username);
        user.setEmail(email);
        return user;

    }
}

