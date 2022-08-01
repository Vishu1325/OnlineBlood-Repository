package net.javaguides.springboot.web.dto;

import lombok.Data;

@Data
public class UserRegistrationDto {
    private String firstName;
    private String lastName;
    private String email;

    private String password;

    private String phoneNumber ;

    private String bloodGroup ;

    private String rareBlood ;

    private String gender ;

    private String age ;

    private String state ;

    private String city ;

    private String pinCode ;

    private String fullAddress ;

    public UserRegistrationDto(){

    }

    public UserRegistrationDto(String firstName, String lastName, String email, String password) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }


}