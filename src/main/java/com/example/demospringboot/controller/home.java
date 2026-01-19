package com.example.demospringboot.controller;

import com.example.demospringboot.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
    @GetMapping("/")
    public StudentModel getStudent(){
        StudentModel student = new StudentModel(1,"Prince","prince@gmail.com");
                return student;
    }

//    @GetMapping("about/")
//        public String about() {
//        return "this is the about page";
//        }
}
