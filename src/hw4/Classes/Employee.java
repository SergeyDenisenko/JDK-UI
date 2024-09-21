package hw4.Classes;

import hw4.Interfaces.iEmployee;

public class Employee implements iEmployee {
    private int serviceNumber;
    private String phoneNumber;
    private String name;
    private int experience;

    public Employee(int serviceNumber, String name) {
        this.serviceNumber = serviceNumber;
        this.name = name;
    }

    public Employee(int serviceNumber, String name, String phoneNumber) {
        this(serviceNumber, name);
        this.phoneNumber = phoneNumber;
    }

    public Employee(int serviceNumber, String name, String phoneNumber, int experience) {
        this(serviceNumber, name, phoneNumber);
        this.experience = experience;
    }

    @Override
    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    @Override
    public void setPhoneNumber(String phone) {
        this.phoneNumber = phone;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public int getServiceNumber() {
        return serviceNumber;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Service number: " + serviceNumber + "\tName: " + name + "\tPhone number: " + phoneNumber + "\tExperience: " + experience;
    }
    
}
