public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        customer.age = 19;
        employee.email = "yeskzgn@gmail.com";

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.Add();
        employeeManager.BestEmployee();
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.BestCustomer();


    }
}