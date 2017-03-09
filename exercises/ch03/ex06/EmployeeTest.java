public class EmployeeTest{
    public static void main(String[] args){
        Employee e1 = new Employee("João", "Machado", 700);
        Employee e2 = new Employee("Hamilton", "Monteiro",1600);
        Employee e3 = new Employee("Juca", "Doidão", -8);
        
        System.out.printf("%s %s salary per year: $%.2f%n",e1.getName(),e1.getLastName(),
                (e1.getSalary() * 12));
        System.out.printf("%s %s salary per year: $%.2f%n",e2.getName(),e2.getLastName(),
                (e2.getSalary() * 12));
        e1.setSalary((e1.getSalary() * 0.10) + e1.getSalary());
        e2.setSalary((e2.getSalary() * 0.10) + e2.getSalary());
        
        System.out.printf("New %s yearly salary with a raise of 10 percent: $%.2f%n",e1.getName(), (e1.getSalary() * 12) );
        System.out.printf("New %s yearly salary with a raise of 10 percent: $%.2f%n",e2.getName(), (e2.getSalary() * 12) );
    }
}