package com.example.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="emp_table")
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Employee extends BaseEntity{
    @Column(length = 20)
    private String firstName;
    @Column(length = 20)
    private String lastName;
    @Column(length = 30,unique = true)
    private String email;
    @Column(length = 20,nullable = false)
    //How to tell Jackson (i.e a vendor for ser n deserial) to skip the property
    //from ser yet retain during de-ser ?
    //Jackson uses : getters : during ser. n setters during de-ser.
    private String password;
    private String department;
    private String location;
    private LocalDate joinDate;
    private double salary;
    //add a propert to store image path
    @Column(length = 300)
    private String imagePath;
    //name based ctor
    public Employee(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
