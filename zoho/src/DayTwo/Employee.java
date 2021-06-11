package DayTwo;

class Employee{  

    int id;  

    String name;  

    static String company = "TCS";  

      

    static void change(){  

    company = "Zoho";  

    }  

 

    Employee(int i, String n){  

    id = i;  

    name = n;  

    }  

 

    void display (){
    
    	System.out.println(id+" "+name+" "+company);
    	
    }  

 

   public static void main(String args[]){  


   Employee e1 = new Employee (111,"Yusuf");  
   Employee.change();
   Employee e2 = new Employee (123,"Alex");  

   e1.display();  

   e2.display();  

   }  
}  