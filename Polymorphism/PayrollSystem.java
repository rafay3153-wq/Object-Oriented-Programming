public class PayrollSystem {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        for (int i=0; i < employees.length; i++) {
            if (employees [i] instanceof BasePlusCommissionEmployee)
                {
                BasePlusCommissionEmployee emp= (BasePlusCommissionEmployee )
                employees[i];
                emp.setBaseSalary( 1.10 * emp.getBaseSalary() );
                System.out.println("New base salary with 10 percent increase is " +
                emp.getBaseSalary() );
                employees[i]=emp;
                }
            System.out.println("Earning is " + employees[i].earnings());
        }
    }
}