package api.models;

import lombok.Data;

@Data
public class Customer {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phone;
    private String ssn;
    private String username;
    private String password;
    private String repeatedPassword;
}
