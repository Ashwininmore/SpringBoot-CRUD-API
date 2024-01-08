package in.ashwinimore.springbootCRUD.SpringBootcrudAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashwinimore.springbootCRUD.SpringBootcrudAPI.dao.TaskDAO;
import in.ashwinimore.springbootCRUD.SpringBootcrudAPI.model.Task;
@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskDAO taskDAO; 
	
	@Transactional
	@Override
	public List<Task> get() {
		return taskDAO.get();
	}
	@Transactional
	@Override
	public Task get(int id) {
		return taskDAO.get(id);
	}
	@Transactional
	@Override
	public void save(Task task) {
		taskDAO.save(task);		
	}
	@Transactional
	@Override
	public void delete(int id) {
		taskDAO.delete(id);
		
	}

}
