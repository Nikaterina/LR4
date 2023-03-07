package ru.kh.lr4.service;

import ru.kh.lr4.entity.Student;
import org.springframework.stereotype.Service;


import java.util.List;
@Service

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);

}
