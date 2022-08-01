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
@Table(name = "BloodBank")
public class BloodBank1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    private String BBname ;

    private String BBphoneNumber ;

    private String BBstate ;

    private String BBcity ;

    private String BBdescription ;

    private String BBfullAddress ;

}
