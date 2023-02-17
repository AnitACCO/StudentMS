package com.SMS.StudentsMS.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;

@Getter
@Setter
@Entity
@Table(name = "school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int School_id;
    private String school_name;
    private String address;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "studId", referencedColumnName = "school_id")
    List<Student> students = new ArrayList<>() ;

    @Override
    public String toString() {
        return "School{" +
                "School_id=" + School_id +
                ", school_name='" + school_name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
