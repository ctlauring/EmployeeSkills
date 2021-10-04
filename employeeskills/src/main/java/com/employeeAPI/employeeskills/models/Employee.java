package com.employeeAPI.employeeskills.models;


import org.hibernate.annotations.GenericGenerator;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    private @Id @GeneratedValue(generator="system-uuid") @GenericGenerator(name="system-uuid",
            strategy = "uuid") String id;
    private String firstName;
    private String lastName;
//    private Address address;
    private String contactEmail;
    private String birthDate;
    private String hiredDate;
    private String role;
    private String businessUnit;
    //  private Employee assignedTo;


    public Employee(String firstName, String lastName, /*Address address,*/ String contactEmail,
                    String birthDate, String hiredDate, String role, String businessUnit/*, Employee assignedTo*/) {

        this.firstName = firstName;
        this.lastName = lastName;
//        this.address = address;
        this.contactEmail = contactEmail;
        this.birthDate = birthDate;
        this.hiredDate = hiredDate;
        this.role = role;
        this.businessUnit = businessUnit;
//        this.assignedTo = assignedTo;
    }

    public Employee(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

/*    public Address getAddress() {
        return address;
    }*/

/*    public void setAddress(Address address) {
        this.address = address;
    }*/

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

/*    public Employee getAssignedTo() {
        return assignedTo;
    }*/

/*
    public void setAssignedTo(Employee assignedTo) {
        this.assignedTo = assignedTo;
    }
*/

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.firstName, employee.firstName)
                && Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.role);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.firstName + '\'' + ", role='" + this.role + '\'' + '}';
    }
}
