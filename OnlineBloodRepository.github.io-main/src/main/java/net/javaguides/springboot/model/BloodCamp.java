package net.javaguides.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BloodCamp")
public class BloodCamp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    private String BDname ;

    private String BDphoneNumber ;

    private String BDstate ;

    private String BDcity ;

    private String BDdescription ;

    private String BDfullAddress ;

}
