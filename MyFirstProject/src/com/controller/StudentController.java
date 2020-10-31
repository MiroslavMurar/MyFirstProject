package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Student;
import com.repository.StudentDAO;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentDAO studentDAO; 
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student student = new Student(); 
		
		model.addAttribute("student", student); 
		
		return "student/student-form"; 
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "student/student-form"; 
		} else {
			studentDAO.save(student);
			
//			//Toto mi sposobilo mega problemy, dostaval som error a nechapal som preco... Teraz uz viem ze model nerad uklaza objekt ktoreho validacie nie su splnene :D 
//			model.addAttribute("student", student); 
			
			return "student/student-confirmation"; 
		}
		
		
		
		
	}	
}
