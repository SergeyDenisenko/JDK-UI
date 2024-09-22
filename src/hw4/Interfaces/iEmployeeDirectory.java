package hw4.Interfaces;

import java.util.List;

/**
 * Интерфейс описыващий справочник сотрудников
 */
public interface iEmployeeDirectory {

    /**
     * Добавляет сотрудника в справочник
     * @param employee Сотрудник
     */
    void add(iEmployee employee);

    /**
     * Осуществляет поиск по стажу
     * @param experience стаж
     * @return список сотрудников
     */
    List<iEmployee> findByExperience(int experience);

    /**
     * Осуществляет поиск по табельному номеру
     * @param serviceNumber табельный номер
     * @return сотрудник
     */
    iEmployee findByServiceNumber(int serviceNumber);

    /**
     * Осуществляет поиск номера телефона сотрудника по его имени
     * @param name имя сотрудника
     * @return список номеров телефона
     */
    List<iEmployee> getPhoneByName(String name);

    /**
     * Осуществляет поиск номера телефона сотрудника по его имени,
     * в подробностях
     * @param name имя сотрудника
     * @param inDetail подробно
     * @return список сотрудников с их номерами телефона
     */
    List<iEmployee> getPhoneByName(String name, boolean inDetail);
}
