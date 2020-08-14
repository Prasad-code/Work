package com.EW.ser;

import java.util.List;
import java.util.Optional;

import com.EW.excep.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import com.EW.mod.EmpWork;
import com.EW.repo.WorkServiceRepo;
import org.springframework.stereotype.Service;

@Service
public class WorkService {


	@Autowired
	private WorkServiceRepo repo;

	public EmpWork add(EmpWork emp) {

		return repo.save(emp);
	}

	public List<EmpWork> findAll() {
		return (List<EmpWork>) repo.findAll();

	}

	public Optional<EmpWork> findById(Integer employee_id) {
		Optional<EmpWork> e1=repo.findById(employee_id);
		if(!e1.isPresent())
		{
			throw new ResourceNotFoundException(""+employee_id);
		}
		return repo.findById(employee_id);
	}


}