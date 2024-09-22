package hw4.Classes;

import hw4.Interfaces.iEmployee;
import hw4.Interfaces.iEmployeeDirectory;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDirectory implements iEmployeeDirectory {
    private List<iEmployee> list;

    public EmployeeDirectory(iEmployee employee) {
        this.list = new ArrayList<>();
        this.list.add(employee);
    }

    @Override
    public void add(iEmployee employee) {
        this.list.add(employee);
    }

    @Override
    public List findByExperience(int experience) {
        return list.stream().filter(employee -> employee.getExperience() == experience).collect(Collectors.toList());
    }

    @Override
    public iEmployee findByServiceNumber(int serviceNumber) {
        return list.stream().filter(employee -> employee.getServiceNumber() == serviceNumber).findFirst().get();
    }

    @Override
    public List getPhoneByName(String name) {
        return list.stream().filter(employee -> employee.getName().equalsIgnoreCase(name)).map(employee -> employee.getPhoneNumber()).collect(Collectors.toList());
    }
    
    public List getPhoneByName(String name, boolean inDetail) {
        if (inDetail)
        {
            return list.stream().filter(employee -> employee.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
        }
        return this.getPhoneByName(name);
    }
}
