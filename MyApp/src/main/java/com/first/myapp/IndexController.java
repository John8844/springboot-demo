package com.first.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Controller
@ResponseBody
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "about";
    }
    @GetMapping("/contact")
    public String contact(){
        return "Contact";
    }
    @GetMapping("/student")
    public Student student(){
        return new Student("John",22);
    }
    @GetMapping("/students")
    public List<Student> students(){
        List<Student> students=new ArrayList<>();
        students.add(new Student("John",22));
        students.add(new Student("Thomas",23));
        return students;
    }
    @GetMapping("/student/{name}/{rollno}")
    public Student studentPathVar(
            @PathVariable("name") String Name,
            @PathVariable("rollno") int rollno){
        return new Student(Name,rollno);
    }
    @GetMapping("/student/query")
    public Student studentQueryParam(@RequestParam(name = "name") String name,@RequestParam(name = "rollno") int rollno){
        return new Student(name,rollno);
    }
}

