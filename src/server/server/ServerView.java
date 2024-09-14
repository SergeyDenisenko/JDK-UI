package server.server;

/**
 * Интерфейс описывающий абстракцию Server GUI
 */
interface ServerView {
    /**
     * Метод для отображения сообщения в GUI
     * @param text текст сообщения
     */
    public void showMessage(String text);
    /**
     * Метод для отключения сервера
     */
    public void disconnect();
    /**
     * Метод для включения сервера
     */
    public void connect();
}
