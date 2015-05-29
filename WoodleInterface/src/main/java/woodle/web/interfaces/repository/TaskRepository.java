package woodle.web.interfaces.repository;

import org.springframework.dao.DataAccessException;

import woodle.web.entity.Task;

public interface TaskRepository {
	
	public Task loadTaskbyId(Long id) throws DataAccessException;
	
	public void createTask(Task task);
	
	public void deleteTask(Task task);
	
	public void updateTask(Task task);
	

}
