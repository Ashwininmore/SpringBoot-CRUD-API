package in.ashwinimore.springbootCRUD.SpringBootcrudAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashwinimore.springbootCRUD.SpringBootcrudAPI.model.Task;
import in.ashwinimore.springbootCRUD.SpringBootcrudAPI.service.TaskService;

@RestController
@RequestMapping("/api")
public class TaskController {
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/task")
	public List<Task> get(){
		return taskService.get();
	}
	
	
}
