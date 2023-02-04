package ClassesAndObjects;

public class ClassesAndObjectsExercises {
    //Opretter car objekt
    public static void carExercise() {
        Car car = new Car();
        car.start();
        car.stop();
        car.move();
    }

    //Opretter car objekt
    public static void driverExercise() {
        Driver driver = new Driver();
        driver.drive();
    }

    //Opretter employee objekt
    public static void employeeExercise() {
        Employee employee1 = new Employee("Hanne", "Hansen", 25000);
        Employee employee2 = new Employee("Jens", "Larsen", 30000);
        //employees uden 10% raise
        System.out.println("Employee’s yearly salary without raise:");
        System.out.println(employee1.firstName + " " + employee1.lastName + " yearly salary is " + employee1.displayYearlySalary() + " kr.");
        System.out.println(employee2.firstName + " " + employee2.lastName + " yearly salary is " + employee2.displayYearlySalary() + " kr.");

        //Her kalder jeg employee1 og employee2 med den nye årlige løn med lønforhøjelse (1.10)
        employee1.raiseSalaryWithTenProcent();
        employee2.raiseSalaryWithTenProcent();

        System.out.println(" "); //Laver mellemrum mellem årlig løn og årlig løn med lønstigning

        //employees med 10% raise
        System.out.println("Employee’s yearly salary with 10%:");
        System.out.println(employee1.firstName + " " + employee1.lastName + " yearly salary is " + employee1.displayYearlySalary() + " kr.");
        System.out.println(employee2.firstName + " " + employee2.lastName + " yearly salary is " + employee2.displayYearlySalary() + " kr.");
    }
}
