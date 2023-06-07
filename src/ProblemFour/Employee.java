package ProblemFour;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirsName(String firstName){
        return firstName;
    }

    public String getLastName(String lastName){
        return lastName;
    }

    public String getSocialSecurityNumber(String socialSecurityNumber){
        return socialSecurityNumber;
    }

    public abstract double getPayment();
}
