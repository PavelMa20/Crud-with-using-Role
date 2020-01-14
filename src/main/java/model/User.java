package model;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "clients")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "login")
    private String login;
    @Column(name = "role")
    private String role;

    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public User(String name, String password, String login, String role) {
        this.name = name;
        this.password = password;
        this.login = login;
        this.role = role;
    }

    public User(int id, String name, String password, String login, String role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.login = login;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId() == user.getId() &&
                getName().equals(user.getName()) &&
                getPassword().equals(user.getPassword()) &&
                getLogin().equals(user.getLogin()) &&
                getRole().equals(user.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPassword(), getLogin(), getRole());
    }
}
