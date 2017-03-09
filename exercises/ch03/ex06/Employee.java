public class Employee{
    private String name;
    private String lastName;
    private double salary;
    
    public Employee(String name,String last, double salary){
        this.name = name;
        this.lastName = last;
        if (salary < 0){
            this.salary = 0;
        }else{
            this.salary = salary;
        }
    }
    
    public double yearlySalary(){
        return this.salary * 12;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    } 
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setSalary(double salary){
        this.salary = salary;   
    }
    
    public double getSalary(){
        return salary;
    }
    
    
}