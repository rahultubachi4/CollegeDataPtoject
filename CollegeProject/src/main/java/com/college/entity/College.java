package com.college.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "College_Data")


public class College
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;

    @Column(name = "College_Name")
    private String collegeName;

    @Column(name = "College_Location")
    private String collegeLocation;

    @Column(name = "College_Dept")
    private String collegeDept;

}
