package Innova.SpringBoot_Postgres.dto;

public class UserDto {

    private String name;
    private String email;

    public UserDto(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
