package hw4.Classes;

import hw4.Interfaces.iEmployee;
import hw4.Interfaces.iEmployeeDirectory;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс реализующий интерфейс справочника сотрудников
 */
public class EmployeeDirectory implements iEmployeeDirectory {
    private List<iEmployee> list;

    public EmployeeDirectory(iEmployee employee) {
        this.list = new ArrayList<>();
        this.list.add(employee);
    }

    /**
     * Добавляет сотрудника в справочник
     * @param employee Сотрудник
     */
    @Override
    public void add(iEmployee employee) {
        this.list.add(employee);
    }

    /**
     * Осуществляет поиск по стажу
     * @param experience стаж
     * @return список сотрудников
     */
    @Override
    public List findByExperience(int experience) {
        return list.stream().filter(employee -> employee.getExperience() == experience).collect(Collectors.toList());
    }

    /**
     * Осуществляет поиск по табельному номеру
     * @param serviceNumber табельный номер
     * @return сотрудник
     */
    @Override
    public iEmployee findByServiceNumber(int serviceNumber) {
        return list.stream().filter(employee -> employee.getServiceNumber() == serviceNumber).findFirst().get();
    }

    /**
     * Осуществляет поиск номера телефона сотрудника по его имени
     * @param name имя сотрудника
     * @return список номеров телефона
     */
    @Override
    public List getPhoneByName(String name) {
        return list.stream().filter(employee -> employee.getName().equalsIgnoreCase(name)).map(employee -> employee.getPhoneNumber()).collect(Collectors.toList());
    }
    
    /**
     * Осуществляет поиск номера телефона сотрудника по его имени,
     * в подробностях
     * @param name имя сотрудника
     * @param inDetail подробно
     * @return список сотрудников с их номерами телефона
     */
    @Override
    public List getPhoneByName(String name, boolean inDetail) {
        if (inDetail)
        {
            return list.stream().filter(employee -> employee.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
        }
        return this.getPhoneByName(name);
    }
}
