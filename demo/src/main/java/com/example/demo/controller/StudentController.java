package com.example.demo.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
@RequestMapping("/students")
public class StudentController {
	Student s1= new Student("2020ICT24","piumal",26,"ICT",2.86);
	Student s2= new Student("2020ICT97","nera",24,"ICT",3.4);
	Student s3= new Student("2020ICT63","chamodi",23,"ICT",3.72);
	Student s4= new Student("2020ICT52","gima",24,"ICT",3.6);
	Student s5= new Student("2020ICT18","chamith",23,"ICT",3.6);
	
	List<Student> students=new ArrayList<Student>();
	
	@GetMapping("/student")
	public List<Student> getStudent() {
		students.add(s1);
		students.add(s2);
		students.add(s3);
		return students;
	}
	
	public Student getStudent(@PathVariable) 
	student;students

}
