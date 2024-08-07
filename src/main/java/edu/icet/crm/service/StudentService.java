package edu.icet.crm.service;

import edu.icet.crm.model.Student;

public class StudentService {
   public Student getstudent(){
       Student student=new Student();
       student.setEmail("sahan@");
       student.setName("sahan");
       student.setContacNumber("0781600386");

       return student;
   }
}
