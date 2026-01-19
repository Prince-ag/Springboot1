package com.example.demospringboot.controller;

import com.example.demospringboot.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
@RestController

public class home {
    @GetMapping("/")
    public List<StudentModel> getStudents() {

        List<StudentModel> students = new ArrayList<>();

        students.add(new StudentModel(1, "Prince", "prince@gmail.com"));
        students.add(new StudentModel(2, "Rahul", "rahul@gmail.com"));
        students.add(new StudentModel(3, "Aman", "aman@gmail.com"));
        students.add(new StudentModel(4, "Neha", "neha@gmail.com"));
        students.add(new StudentModel(5, "Simran", "simran@gmail.com"));

        return students;
    }

//    @GetMapping("about/")
//        public String about() {
//        return "this is the about page";
//        }
}
