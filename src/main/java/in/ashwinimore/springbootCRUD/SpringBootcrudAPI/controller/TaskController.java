package in.ashwinimore.springbootCRUD.SpringBootcrudAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PostMapping("/task")
	public Task save(@RequestBody Task taskObj){
		taskService.save(taskObj);
		return taskObj;
	}
	@GetMapping("/task/{id}")
	public Task get(@PathVariable int id) {
		Task taskObj =taskService.get(id);
		if(taskObj== null) {
			throw new RuntimeException("Task with id"+id+"is not found");
		}
		return taskObj;
	}
	@DeleteMapping("/task/{id}")
	public String delete(@PathVariable int id) {
		taskService.delete(id);
		return "Task has been deleted with id:"+id;
	}
	@PutMapping("/task")
	public Task update(@RequestBody Task taskObj) {
		taskService.save(taskObj);
		return taskObj;
	}
}
