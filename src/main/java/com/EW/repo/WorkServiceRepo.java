package com.EW.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.EW.mod.EmpWork;

@Repository
public interface WorkServiceRepo extends CrudRepository<EmpWork, Integer> {

}
