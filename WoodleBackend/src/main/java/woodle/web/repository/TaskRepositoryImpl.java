package woodle.web.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import woodle.web.entity.Task;
import woodle.web.interfaces.repository.TaskRepository;

@Repository
public class TaskRepositoryImpl implements TaskRepository{

	@PersistenceContext
	protected EntityManager entityManager;
	
	@Override
	public Task loadTaskbyId(Long id) throws DataAccessException {
		final CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<Task> crit = criteriaBuilder.createQuery(Task.class);
		final Root<Task> task = crit.from(Task.class);
		crit.select(task).where(criteriaBuilder.equal(task.get("id"), id));

		return entityManager.createQuery(crit).getSingleResult();
	}

	@Override
	@Transactional(readOnly = false)
	public void createTask(Task task) {
		entityManager.persist(task);
		
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteTask(Task task) {
		Task t = entityManager.getReference(Task.class, task.getId());
		entityManager.remove(t);
		
	}

	@Override
	@Transactional(readOnly = false)
	public void updateTask(Task task) {
		entityManager.merge(task);
		
	}

	@Override
	public List<Task> loadTasksbyTaskList(String taskList) {
		final CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<Task> crit = criteriaBuilder.createQuery(Task.class);
		final Root<Task> tasks = crit.from(Task.class);
		crit.select(tasks).where(criteriaBuilder.equal(tasks.get("taskList"), taskList));

		return entityManager.createQuery(crit).getResultList();
	}

}
