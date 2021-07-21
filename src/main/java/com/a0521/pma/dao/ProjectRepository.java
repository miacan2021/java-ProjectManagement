package com.a0521.pma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.a0521.pma.entity.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {
	
	@Override
	public List<Project> findAll();
}