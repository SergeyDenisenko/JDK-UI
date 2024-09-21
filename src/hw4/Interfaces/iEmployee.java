package hw4.Interfaces;

public interface iEmployee {
    void setServiceNumber(int serviceNumber);
    void setPhoneNumber(String phone);
    void setName(String name);
    void setExperience(int experience);

    int getServiceNumber();
    String getPhoneNumber();
    String getName();
    int getExperience();
}
