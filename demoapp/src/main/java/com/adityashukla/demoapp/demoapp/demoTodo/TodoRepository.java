package com.adityashukla.demoapp.demoapp.demoTodo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository <DemoTodo, Long>{
	public List<DemoTodo> findByUsername(String username);
}
