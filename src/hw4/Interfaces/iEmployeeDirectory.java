package hw4.Interfaces;

public interface iEmployeeDirectory<T> {
    void add(iEmployee employee);
    List<iEmployee> findByExperience(int experience);
    iEmployee findByServiceNumber(T serviceNumber);
    List<iEmployee> getPhoneByName(String name);
}
