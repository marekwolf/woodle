package woodle.web.interfaces.service;

import org.springframework.dao.DataAccessException;
import woodle.web.entity.Task;

public interface TaskService {

	
	public Task loadTaskById(Long id) throws DataAccessException;
	
	public void createTask(Task task);
	
	public void deleteTask(Task task);
	
	public void updateTask(Task task);
	
	
}
