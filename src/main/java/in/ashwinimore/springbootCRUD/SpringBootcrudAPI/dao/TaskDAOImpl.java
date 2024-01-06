package in.ashwinimore.springbootCRUD.SpringBootcrudAPI.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ashwinimore.springbootCRUD.SpringBootcrudAPI.model.Task;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
@Repository
public class TaskDAOImpl implements TaskDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Task> get() {
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Task> query=currentSession.createQuery("from Task", Task.class);
		List<Task> list=query.getResultList();
		return list;
	}

	@Override
	public Task get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Task task) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
