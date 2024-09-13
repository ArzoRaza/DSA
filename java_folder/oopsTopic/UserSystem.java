package oopsTopic;

import java.util.ArrayList;
import java.util.List;

class User {
    private String username;
    private String password; // password should be encrypted in real-world cases
    private String role; // Can be 'admin' or 'user'

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public String getRole() {
        return role;
    }
}


class UserManager {
    private List<User> users = new ArrayList<>();

    public void registerUser(String username, String password, String role) {
        if (findUserByUsername(username) == null) {
            users.add(new User(username, password, role));
            System.out.println("User registered successfully!");
        } else {
            System.out.println("Username already exists.");
        }
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public boolean loginUser(String username, String password) {
        User user = findUserByUsername(username);
        if (user != null && user.checkPassword(password)) {
            System.out.println("Login successful!");
            return true;
        }
        System.out.println("Invalid username or password.");
        return false;
    }
}
class LoginSystem {
    private UserManager userManager;
    private User currentUser;

    public LoginSystem(UserManager userManager) {
        this.userManager = userManager;
    }

    public void login(String username, String password) {
        if (userManager.loginUser(username, password)) {
            currentUser = userManager.findUserByUsername(username);
            System.out.println("Welcome, " + currentUser.getUsername());
        }
    }

    public void logout() {
        if (currentUser != null) {
            System.out.println(currentUser.getUsername() + " logged out.");
            currentUser = null;
        } else {
            System.out.println("No user is logged in.");
        }
    }

    public void showDashboard() {
        if (currentUser != null) {
            if ("admin".equals(currentUser.getRole())) {
                System.out.println("Admin Dashboard");
            } else {
                System.out.println("User Dashboard");
            }
        } else {
            System.out.println("Please log in first.");
        }
    }
}
public class UserSystem {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        LoginSystem loginSystem = new LoginSystem(userManager);

        // Register users
        userManager.registerUser("admin", "admin123", "admin");
        userManager.registerUser("user1", "user123", "user");

        // Attempt to login
        loginSystem.login("admin", "admin123");
        loginSystem.showDashboard(); // Shows Admin Dashboard

        loginSystem.logout();

        loginSystem.login("user1", "user123");
        loginSystem.showDashboard(); // Shows User Dashboard

        loginSystem.logout();
    }
}
