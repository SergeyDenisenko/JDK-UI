package hw4.Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import hw4.Interfaces.iEmployee;
import hw4.Interfaces.iEmployeeDirectory;

public class EmployeeDirectory2 implements iEmployeeDirectory {
    private HashMap<Integer, iEmployee> list;

    public EmployeeDirectory2(iEmployee employee) {
        this.list = new HashMap<>();
        this.list.put(employee.getServiceNumber(), employee);
    }

    @Override
    public void add(iEmployee employee) {
        if (!list.containsKey(employee.getServiceNumber()))
        {
            list.put(employee.getServiceNumber(), employee);
        }
    }

    public void edit(iEmployee employee) {
        if (list.containsKey(employee.getServiceNumber()))
        {
            list.put(employee.getServiceNumber(), employee);
        }
    }

    public void remove(int serviceNumber) {
        if (list.containsKey(serviceNumber))
        {
            list.remove(serviceNumber);
        }
    }

    @Override
    public List<iEmployee> findByExperience(int experience) {
        return list.values().stream().filter(employee -> employee.getExperience() == experience).collect(Collectors.toList());
    }

    @Override
    public iEmployee findByServiceNumber(int serviceNumber) {
        return list.get(serviceNumber);
    }

    @Override
    public List getPhoneByName(String name) {
        return list.values().stream().filter(employee -> employee.getName().equalsIgnoreCase(name)).map(employee -> employee.getPhoneNumber()).collect(Collectors.toList());
    }

    @Override
    public List getPhoneByName(String name, boolean inDetail) {
        if (inDetail)
        {
            return list.values().stream().filter(employee -> employee.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
        }
        return this.getPhoneByName(name);
    }
    
}
