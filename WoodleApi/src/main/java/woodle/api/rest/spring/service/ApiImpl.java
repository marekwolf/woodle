package woodle.api.rest.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import woodle.api.rest.entity.TaskRequest;
import woodle.api.rest.entity.TaskResponse;
import woodle.api.rest.spring.interfaces.Api;
import woodle.web.entity.Task;
import woodle.web.interfaces.service.TaskService;

public class ApiImpl implements Api {

	@Autowired
	private TaskService taskService;

	@Override
	public TaskResponse getTasks(String taskList) {
		List<Task> tasks = taskService.loadTaskByTaskList(taskList);
		TaskResponse t = new TaskResponse();
		t.setTasks(tasks);
		return t;
	}

	public void createTask(TaskRequest r) {
		Task task = r.getTask();

		taskService.createTask(task);

	}

	@Override
	public void updateTask(TaskRequest request) {
		Task task = request.getTask();

		taskService.updateTask(task);

	}

	@Override
	public void deleteTask(TaskRequest request) {
		Task task = request.getTask();

		taskService.deleteTask(task);
	}
}
