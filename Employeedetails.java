package emp.pack;
import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException;  
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.util.ArrayList; 
import java.util.List;  

public class Employeedetails { 
   public List<Employee> getAllEmployees(){ 
     
      List<Employee> employeeList = null; 
      try { 
    	 employeeList = new ArrayList<Employee>();
         File file = new File("Employee.dat"); 
         if (!file.exists()) { 
            employeeList.add(new Employee(1, "Anu", "Developer"));
        	employeeList.add(new Employee(2, "Deva", "Senior Developer")); 
        	employeeList.add(new Employee(3, "Jain", "Associate Developer"));
            employeeList = new ArrayList<Employee>(); 
            
        
            saveEmployeeList(employeeList); 
         } 
         else{ 
            FileInputStream fis = new FileInputStream(file); 
            ObjectInputStream ois = new ObjectInputStream(fis); 
            employeeList = (List<Employee>) ois.readObject(); 
            ois.close(); 
         } 
      } catch (IOException e) { 
         e.printStackTrace(); 
      } catch (ClassNotFoundException e) { 
         e.printStackTrace(); 
      }   
      return employeeList; 
   } 
   private void saveEmployeeList(List<Employee> employeeList){ 
      try { 
         File file = new File("Employee.dat"); 
         FileOutputStream fos;  
         fos = new FileOutputStream(file); 
         ObjectOutputStream oos = new ObjectOutputStream(fos); 
         oos.writeObject(employeeList); 
         oos.close(); 
      } catch (FileNotFoundException e) { 
         e.printStackTrace(); 
      } catch (IOException e) { 
         e.printStackTrace(); 
      } 
   }    
}
