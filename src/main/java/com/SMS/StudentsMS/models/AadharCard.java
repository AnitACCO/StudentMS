package com.SMS.StudentsMS.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
@Table(name = "AadharCard")
public class AadharCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String aadharNumber;
}
