package woodle.api.rest.entity;

import java.util.List;

import woodle.web.entity.Task;

public class TaskResponse {

	private List<Task> tasks;

	private Task task;
	
	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	public void setTask(Task task){
		this.task = task;
	}
	
	public Task getTask() {
		
		return task;
	}

}
