package com.project.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.learning.entity.LearningEntity;
import java.util.List;


public interface Databaserepo extends JpaRepository<LearningEntity, Long> {
	public  List<LearningEntity> findByName(String name);
}
