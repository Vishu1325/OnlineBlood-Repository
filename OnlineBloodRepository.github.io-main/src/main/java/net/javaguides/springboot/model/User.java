package net.javaguides.springboot.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Data
@Entity
@Table(name =  "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    private String password;

    private String phoneNumber ;

    private String bloodGroup ;

    private String rareBlood ;

    private String age ;

    private String gender ;


    private String state ;

    private String city ;

    private String pinCode ;

    private String fullAddress ;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))

    private Collection<Role> roles;

    public User() {

    }

    public <T> User(String firstName, String lastName, String email, String encode, String phoneNumber, String bloodGroup, String rareBlood, String age, String state, String city, String pinCode, String fullAddress, List<T> role_user) {
    }

    public User(String firstName, String lastName, String email, String password, String phoneNumber, String bloodGroup, String rareBlood, String gender,String age, String state, String city, String pinCode, String fullAddress, Collection<Role> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.bloodGroup = bloodGroup;
        this.rareBlood = rareBlood;
        this.gender = gender;
        this.age = age;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
        this.fullAddress = fullAddress;
        this.roles = roles;
    }
}