package hw4.Interfaces;

/**
 * Интерфейс описывающий сотрудника
 */
public interface iEmployee {
    /**
     * Присваивает табельный номер сотруднику
     * @param serviceNumber табельный номер
     */
    void setServiceNumber(int serviceNumber);

    /**
     * Устанавливает номер телефона сотрудника
     * @param phone номер телефона
     */
    void setPhoneNumber(String phone);

    /**
     * Устанавливает имя сотрудника
     * @param name имя сотрудника
     */
    void setName(String name);

    /**
     * Устанавливает стаж сотрудника
     * @param experience Стаж
     */
    void setExperience(int experience);

    /**
     * Возвращает табельный номер сотрудника
     * @return табельный номер
     */
    int getServiceNumber();

    /**
     * Возвращает номер телефона сотрудника
     * @return номер телефона
     */
    String getPhoneNumber();

    /**
     * Возвращает имя сотрудника
     * @return имя
     */
    String getName();

    /**
     * Возвращает стаж сотрудника
     * @return стаж
     */
    int getExperience();
}
