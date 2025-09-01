package ejercicios_extra.ejercicioExtra.modelos;

import java.util.Objects;

public class Empleado implements Comparable<Empleado> {

    private int employeeNumber;
    private String lastName;
    private String firstName;
    private String extension;
    private String email;
    private String officeCode;
    private int reportsTo;
    private String jobTitle;

    public Empleado(int employeeNumber, String lastName, String firstName, String extension, String email, String officeCode, int reportsTo, String jobTitle) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.extension = extension;
        this.email = email;
        this.officeCode = officeCode;
        this.reportsTo = reportsTo;
        this.jobTitle = jobTitle;
    }
    public Empleado(String lastName, String firstName, String extension, String email, String officeCode, int reportsTo, String jobTitle) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.extension = extension;
        this.email = email;
        this.officeCode = officeCode;
        this.reportsTo = reportsTo;
        this.jobTitle = jobTitle;
    }
    public Empleado() {
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getOfficeCode() {
        return officeCode;
    }
    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }
    public int getReportsTo() {
        return reportsTo;
    }
    public void setReportsTo(int reportsTo) {
        this.reportsTo = reportsTo;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override // ID + FirstName
    public boolean equals(Object o) {
        if (!(o instanceof Empleado empleado)) return false;
        return getEmployeeNumber() == empleado.getEmployeeNumber() && Objects.equals(getFirstName(), empleado.getFirstName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeNumber(), getFirstName());
    }

    @Override
    public String toString() {
        return String.valueOf(employeeNumber) + ';' + lastName + ';' + firstName + ';' + extension + ';' + email + ';' + officeCode + ';' + reportsTo + ';' + jobTitle;
    }

    @Override
    public int compareTo(Empleado o) {
        return this.getEmployeeNumber() - o.getEmployeeNumber();
    }
}
