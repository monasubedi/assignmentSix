package ProblemFour;

public class Main {
    public static void main(String[]args){
        CommissionEmployee commissionEmployee = new CommissionEmployee("Name","One","123",2000,0.5);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Name","Two","234",4000,8);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Name","Three","456",6000);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Name","Four","888",4000,0.6,4000);
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Name","Five","789",8000,7);
        Employee[] employees = new Employee[5];
        employees[0] = commissionEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = salariedEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = hourlyEmployee1;

        for(Employee e: employees){
            System.out.println(e.getPayment());
        }
    }
}
