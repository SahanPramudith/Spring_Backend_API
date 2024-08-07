package edu.icet.crm.controller;

import edu.icet.crm.model.Student;
import edu.icet.crm.service.StudentService;

public class StudentController {
    public Student getstudent(){
        StudentService service=new StudentService();
        Student getstudent = service.getstudent();
        System.out.println(getstudent);

        return getstudent;
    }
}
