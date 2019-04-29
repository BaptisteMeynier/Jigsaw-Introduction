package com.java.jigsaw.student.client;

import com.java.jigsaw.student.model.Student;
import com.java.jigsaw.student.service.StudentService;
import com.java.jigsaw.student.service.dbimpl.StudentDbService;

public class StudentClient {

    public static void main(String[] args) {
        StudentService service = new StudentDbService();
        service.create(new Student());
        service.read("17SS0001");
        service.update(new Student());
        service.delete("17SS0001");
    }
}