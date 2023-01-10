package com.example.Library.Management.System.Service;


import com.example.Library.Management.System.Enums.CardStatus;
import com.example.Library.Management.System.Models.Card;
import com.example.Library.Management.System.Models.Student;
import com.example.Library.Management.System.Repository.StudentRepository;
import com.example.Library.Management.System.RequestDto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CardService cardService;

    public String createStudent(StudentRequestDto studentRequestDto){

        Student student=new Student();
        student.setAge(studentRequestDto.getAge());
        student.setName(studentRequestDto.getName());
        student.setEmail(studentRequestDto.getEmail());
        student.setCountry(studentRequestDto.getCountry());


        student.setCard(cardService.createCard(student));

        studentRepository.save(student);

        return "Successfully created student ans card.";
    }
}
