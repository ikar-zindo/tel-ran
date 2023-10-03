package org.example._2023_09_15.refactor_code.dryKissYagni;

public class Employee {
    private String firstName;
    private String lastName;
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public String getInitials() {
        return firstName.charAt(0) + "." + lastName.charAt(0) + ".";
    }

    public String getEmail() {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@company.com";
    }
}