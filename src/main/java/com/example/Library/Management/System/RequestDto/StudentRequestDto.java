package com.example.Library.Management.System.RequestDto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class StudentRequestDto {

    private int age;

    @Column(nullable = false)
    private String name;

    private String email;

    @Column(unique = true, nullable = false)
    private String country;

}
