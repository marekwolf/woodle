package woodle.web.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import woodle.web.entity.Task;
import woodle.web.interfaces.repository.TaskRepository;

@Repository
public class TaskRepositoryImpl implements TaskRepository{

	@PersistenceContext
	protected EntityManager entityManager;
	
	@Override
	public Task loadTaskbyId(Long id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createTask(Task task) {
		entityManager.persist(task);
		
	}

	@Override
	public void deleteTask(Task task) {
		entityManager.remove(task);
		
	}

	@Override
	public void updateTask(Task task) {
		entityManager.merge(task);
		
	}

}
