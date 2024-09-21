package hw4.Interfaces;

import java.util.List;

public interface iEmployeeDirectory {
    void add(iEmployee employee);
    List<iEmployee> findByExperience(int experience);
    iEmployee findByServiceNumber(int serviceNumber);
    List<iEmployee> getPhoneByName(String name);
}
