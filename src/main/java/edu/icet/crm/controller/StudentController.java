package edu.icet.crm.controller;

import edu.icet.crm.model.Student;
import edu.icet.crm.service.StudentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
public class StudentController {

    @GetMapping("/student")
    public List<Student> getstudent(){
        StudentService service=new StudentService();
        Student getstudent = service.getstudent();
        Student getstudent2 = service.getstudent();
        System.out.println(getstudent);

        return Arrays.asList(getstudent,getstudent2);
    }
}
