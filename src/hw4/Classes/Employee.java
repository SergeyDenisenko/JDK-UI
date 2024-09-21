package hw4.Classes;

import hw4.Interfaces.*;

public class Employee<T, N> implements iEmployee<T, N> {
    private T serviceNumber;
    private N phoneNumber;
    private String name;
    private int experience;

    public Employee(T serviceNumber, String name) {
        this.serviceNumber = serviceNumber;
        this.name = name;
    }

    public Employee(T serviceNumber, String name, N phoneNumber) {
        this(serviceNumber, name);
        this.phoneNumber = phoneNumber;
    }

    public Employee(T serviceNumber, String name, N phoneNumber, int experience) {
        this(serviceNumber, name, phoneNumber);
        this.experience = experience;
    }

    @Override
    public void setServiceNumber(T serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    @Override
    public void setPhoneNumber(N phone) {
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
    public T getServiceNumber() {
        return serviceNumber;
    }

    @Override
    public N getPhoneNumber() {
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
