package com.java.jigsaw.student.service.dbimpl;

import com.java.jigsaw.student.model.Student;
import com.java.jigsaw.student.service.StudentService;

public class StudentDbService implements StudentService {

    public String create(Student student) {
        // Creating student in DB
        return student.getRegistrationId();
    }

    public Student read(String registrationId) {
        // Reading student from DB
        return new Student();
    }

    public Student update(Student student) {
        // Updating sutdent in DB
        return student;
    }

    public String delete(String registrationId) {
        // Deleting sutdent in DB
        return registrationId;
    }
}