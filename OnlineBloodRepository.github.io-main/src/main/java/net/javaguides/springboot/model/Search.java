package net.javaguides.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Table;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BloodBank")
public class Search {

    private String SbloodGroup ;

    private String SpinCode ;

}
