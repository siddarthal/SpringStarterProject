package com.project.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.project.learning.entity.LearningEntity;
import com.project.learning.repo.Databaserepo;

@RestController
@RequestMapping("api/data")
public class DemoController {
	@Autowired
	Databaserepo db;
	@GetMapping
	public List<LearningEntity > getAllData(){
		return db.findAll();
	}
	
	@PostMapping
	public LearningEntity postData(@RequestBody LearningEntity entity) {
		return db.save(entity);
	}
	@GetMapping("/{name}")
	public List<LearningEntity> getByName(@PathVariable String name){
		return db.findByName(name);
	}
	
}
