package in.ashwinimore.springbootCRUD.SpringBootcrudAPI.dao;

import java.util.List;

import in.ashwinimore.springbootCRUD.SpringBootcrudAPI.model.Task;

public interface TaskDAO {
	List<Task> get();
	
	Task get(int id);
	
	void save(Task task);
	
	void delete(int id);
}
