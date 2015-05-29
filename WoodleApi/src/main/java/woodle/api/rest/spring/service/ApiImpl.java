package woodle.api.rest.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import woodle.api.rest.entity.TaskResponse;
import woodle.api.rest.spring.interfaces.Api;
import woodle.web.entity.Task;
import woodle.web.interfaces.service.TaskService;

public class ApiImpl implements Api{

	@Autowired
	private TaskService taskService;

	@Override
	public TaskResponse getTasks() {
		Task task = new Task();
		task.setId(1L);
		task.setText("prasekoza");
		TaskResponse t = new TaskResponse();
		t.setTasks(new ArrayList<String>());
		t.getTasks().add(task.getText());
		return t;
	}

}
