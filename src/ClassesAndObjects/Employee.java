package ClassesAndObjects;

//Create a class called Employee that includes three pieces of information as instance variables
public class Employee {
    public String firstName;
    public String lastName;
    private float monthlySalary;

    //Your class should have a constructor that initializes the three instance variables
    public Employee(String firstName, String lastName, float monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;

        //If the monthly salary is not positive, set it to 0.0
        if (monthlySalary < 0.0) {
            this.monthlySalary = 0.0f;
        }
    }

    //Create two Employee objects and display each object’s yearly salary
    public double displayYearlySalary() { //Behaviour
        double yearlySalary = monthlySalary * 12;
        return yearlySalary;
    }

    //Then give each Employee a 10% raise and display each Employee’s yearly salary again
    public void raiseSalaryWithTenProcent() { //Behaviour
        monthlySalary = monthlySalary * 1.10f;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}
