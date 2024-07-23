package vn.edu.likeion.connectDB.dto;

public class UserDTO {
    private int id;
    private String username;
    private String nameRole;

    public UserDTO( String username ,int id, String nameRole) {
        this.id = id;
        this.username = username;
        this.nameRole = nameRole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nameRole='" + nameRole + '\'' +
                '}';
    }
}
