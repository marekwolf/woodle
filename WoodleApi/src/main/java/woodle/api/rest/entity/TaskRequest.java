package woodle.api.rest.entity;

import woodle.web.entity.Task;

public class TaskRequest {

	private Task task;
	
	public Task getTask() {
		
		return task;
	}
	
	public void setTask (Task task){
		
		this.task = task;
	}
	
}
