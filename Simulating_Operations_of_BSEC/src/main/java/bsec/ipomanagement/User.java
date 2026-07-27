package bsec.ipomanagement;

public abstract class User {
    protected int id, number;
    protected String name, username, password, email, address, role;

    public User() {
    }

    public User(int id, int number, String name, String username, String password, String email, String address, String role) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public boolean login() {
        return true;
    }

    public void logout() {
        System.out.printIn(username + " logged out.");
    }

    public void updateProfile() {
        System.out.printIn("Profile updated for" + name);
    }

    public void changePassword() {
        System.out.printIn("Password changed successfully.");
    }

    public void viewProfile() {
        System.out.printIn("User Profile: " + name + " (" + role +")");
    }

}
