package hw4.Classes;

import hw4.Interfaces.iEmployee;

/**
 * Класс реализующий интерфейс сотрудника
 */
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

    /**
     * Присваивает табельный номер сотруднику
     * @param serviceNumber табельный номер
     */
    @Override
    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    /**
     * Устанавливает номер телефона сотрудника
     * @param phone номер телефона
     */
    @Override
    public void setPhoneNumber(String phone) {
        this.phoneNumber = phone;
    }

    /**
     * Устанавливает имя сотрудника
     * @param name имя сотрудника
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Устанавливает стаж сотрудника
     * @param experience Стаж
     */
    @Override
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * Возвращает табельный номер сотрудника
     * @return табельный номер
     */
    @Override
    public int getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Возвращает номер телефона сотрудника
     * @return номер телефона
     */
    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Возвращает имя сотрудника
     * @return имя
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Возвращает стаж сотрудника
     * @return стаж
     */
    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Service number: " + serviceNumber + "\tName: " + name + "\tPhone number: " + phoneNumber + "\tExperience: " + experience;
    }
    
}
