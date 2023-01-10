package com.example.Library.Management.System.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;


@Entity
@Table(name="Student_table")
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(name="email",unique = true,nullable = false)
    private String email;

    private int age;

    @Column(columnDefinition = "varchar(255) default 'India'")
    private String country;

    @CreationTimestamp
    private Date createdOn;

    @CreationTimestamp
    private Date updatedOn;



    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Card card;
}
