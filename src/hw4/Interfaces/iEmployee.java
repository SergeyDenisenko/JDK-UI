package hw4.Interfaces;

public interface iEmployee<T, N> {
    void setServiceNumber(T serviceNumber);
    void setPhoneNumber(N phone);
    void setName(String name);
    void setExperience(int experience);

    T getServiceNumber();
    N getPhoneNumber();
    String getName();
    int getExperience();
}
