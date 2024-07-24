package com.cybersoft.BC06.BaiTapSpring01.Controller;

import com.cybersoft.BC06.BaiTapSpring01.Entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    // Tạo list chứa danh sách
    private List<Student> studentList = new ArrayList();

    //phương thức @RequestParam

    @PostMapping("/addRequestParam")
    public List<Student> addStudentRequestParam(@RequestParam String name, @RequestParam int age) {
        studentList.add(new Student(name, age)); // nhớ tạo thêm constructor bên Entity
        return studentList;
    }

    //phương thức @PathVariable

    @PostMapping("/addPathVariable/{name}/{age}")
    public List<Student> addStudentPathVariable(@PathVariable String name, @PathVariable int age) {
        studentList.add(new Student(name, age));
        return studentList;
    }

    //phương thức @RequestBody
    @PostMapping("/addRequestBody")
    public List<Student> addStudentRequestBody (@RequestBody Student student) {
        studentList.add(student);
        return studentList;
    }

}



