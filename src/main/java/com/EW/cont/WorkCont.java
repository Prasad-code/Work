package com.EW.cont;

import java.util.List;
import java.util.Optional;

import com.EW.excep.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.EW.mod.EmpWork;
import com.EW.ser.WorkService;

@RestController
@RequestMapping("/dem")
public class WorkCont {
	
	@Autowired
	private WorkService workService; 
	
	@PostMapping("/addEmp")
	public EmpWork addEmp(@RequestBody EmpWork emp)
	{
		return workService.add(emp);
	}

	@GetMapping("/all")
	public List<EmpWork> getAll()
	{
		return workService.findAll();
	}


	@GetMapping("/find/{Employee_Id}")
	public Optional<EmpWork> getById(@PathVariable("Employee_Id") Integer Employee_Id)
	{

		Optional<EmpWork> eee=workService.findById(Employee_Id);

		return  eee;
	}
	
	



}

