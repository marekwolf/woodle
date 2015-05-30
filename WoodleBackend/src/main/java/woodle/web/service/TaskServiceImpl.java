package woodle.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import woodle.web.entity.Task;
import woodle.web.interfaces.repository.TaskRepository;
import woodle.web.interfaces.service.TaskService;

@Service(value="taskService")
@Transactional
public class TaskServiceImpl implements TaskService{

	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public Task loadTaskById(Long id) throws DataAccessException {
		
		return taskRepository.loadTaskbyId(id);
	}

	@Override
	public void createTask(Task task) {
		taskRepository.createTask(task);
		
	}

	@Override
	public void deleteTask(Task task) {
		taskRepository.deleteTask(task);
		
	}

	@Override
	public void updateTask(Task task) {
		taskRepository.updateTask(task);
		
	}

	@Override
	public List<Task> loadTaskByTaskList(String taskList) {
		return taskRepository.loadTasksbyTaskList(taskList);
	}

}
