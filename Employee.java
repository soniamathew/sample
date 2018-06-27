package emp.pack;  

import java.io.Serializable;  
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "employee") 

public class Employee implements Serializable {  
   private static final long serialVersionUID = 1L; 
   private int id; 
   private String name; 
   private String profession; 
   public static int count=0;
   public Employee(){} 

    
   public Employee(int id, String name, String profession){  
      this.id = id; 
      this.name = name; 
      this.profession = profession; 
      count++;
   }  
   public int getId() { 
      return id; 
   }  
   @XmlElement 
   public void setId(int id) { 
      this.id = id; 
   } 
   public String getName() { 
      return name; 
   } 
   @XmlElement
   public void setName(String name) { 
      this.name = name; 
   } 
   public String getProfession() { 
      return profession; 
   } 
   @XmlElement 
   public void setProfession(String profession) { 
      this.profession = profession; 
   }   
} 