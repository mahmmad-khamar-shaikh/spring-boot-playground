package com.zaynsys.springboot.thymeleafdemo.controller;

import com.zaynsys.springboot.thymeleafdemo.entity.Employee;
import com.zaynsys.springboot.thymeleafdemo.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel) {

		List<Employee> employees = employeeService.findAll();
		// add to the spring model
		theModel.addAttribute("employees", employees);

		return "employees/list-employees";
	}

	@GetMapping("/showFormForAdd")
	public  String	showFormForAdd(Model model){
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "employees/employee-form";
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee employee){
		employeeService.save(employee);
		return  "redirect:/employees/list";
	}
}









