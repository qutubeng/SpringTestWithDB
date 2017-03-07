package com.springTest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springTest.Dao.TestRepo;
import com.springTest.Entity.Test;


@RestController
public class TestController {
	
	@Autowired
	private TestRepo repo;
	
	@RequestMapping(value = "/find")
	public List<Test> findall() {
		return repo.findAll();
	}

}
