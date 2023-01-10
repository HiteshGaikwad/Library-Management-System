package com.example.Library.Management.System.Controllers;

import com.example.Library.Management.System.RequestDto.StudentRequestDto;
import com.example.Library.Management.System.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody StudentRequestDto studentRequestDto){

        String result= studentService.createStudent(studentRequestDto);

        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}
