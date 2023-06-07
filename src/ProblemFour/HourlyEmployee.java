package ProblemFour;

public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;

    HourlyEmployee(String firstName,String lastName,String socialSecurityNumber,double wage,double hours){
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double getPayment(){
        return wage * hours;
    }
}
