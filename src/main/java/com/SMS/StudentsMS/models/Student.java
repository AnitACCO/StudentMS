package com.SMS.StudentsMS.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;

@Setter
@Getter
@Data
@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int student_id;

    @Column(name = "name")
    private String name;

    @Column(name = "Phone")
    private Long phone;

    @Column(name = "Class")
    private int gradeClass;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    AadharCard aadharCard;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })

    @JoinTable(name = "student_subject",
            joinColumns = { @JoinColumn(name = "sub_id") },
            inverseJoinColumns = { @JoinColumn(name = "s_id") })
    private Set<Subjects> subjects = new HashSet<>();


    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", gradeClass=" + gradeClass +
                '}';
    }
}
