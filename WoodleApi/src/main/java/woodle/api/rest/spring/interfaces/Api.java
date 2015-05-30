package woodle.api.rest.spring.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.rs.security.cors.CrossOriginResourceSharing;

import woodle.api.rest.entity.TaskRequest;
import woodle.api.rest.entity.TaskResponse;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@CrossOriginResourceSharing(allowAllOrigins = true)
public interface Api {
	
	@GET
	@Path("/TaskList/{taskList}")
	public TaskResponse getTasks(@PathParam("taskList") String taskList);

	@POST
	@Path("/TaskList/new")
	public void createTask(TaskRequest request);

	@POST
	@Path("/TaskList/put")
	public void updateTask(TaskRequest request);
	
	@POST
	@Path("/TaskList/del")
	public void deleteTask(TaskRequest request);
}
