package emp.pack;
import java.util.List; 
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;  
@Path("/Employeeweb") 

public class Employeeweb {  
   Employeedetails employeedetails = new Employeedetails();  
   
   @GET 
   @Path("/employee") 
   @Produces(MediaType.APPLICATION_XML) 
   public List<Employee> getEmployees(){ 
      return employeedetails.getAllEmployees();
      
   }  
   
   @POST
   @Produces(MediaType.APPLICATION_XML)
   public String addMessage() {
   return "Details posted!";
   }
}

