package server.server;

import server.client.*;
import server.repository.*;
import java.util.ArrayList;
import java.util.List;

/**
 * класс содержащий логику работы сервера
 * @ui абстракция графического интерфейса
 * @repository объект для связи с репозиторием
 * @clientsList список подключенных клиентов
 */
public class ServerController {
    private Repository repository;
    private ServerView ui;
    private List<ClientController> clientsList;
    private boolean work;

    /**
     * конструктор класса
     */
    public ServerController() {
        clientsList = new ArrayList<>();
    }

    // сеттеры
    public void setRepository(Repository repos) {
        this.repository = repos;
    }

    public void setServerView(ServerView view) {
        this.ui = view;
    }

    public void setStatus(boolean status) {
        this.work = status;
    }

    /**
     * Метод возвращает статус работы сервера
     * @return статус работы сервера
     */
    public boolean isWork() {
        return this.work;
    }

    /**
     * Метод осуществляющий подключение клиента
     * @param client клиентский контроллер
     * @return возвращает статус подключения клиента
     */
    public boolean connectUser(ClientController client){
        if (!work){
            return false;
        }
        clientsList.add(client);
        return true;
    }

    /**
     * Метод отключающий клиента от сервера
     * @param client клиентский контроллер
     */
    public void disconnectUser(ClientController client){
        clientsList.remove(client);
        if (client != null){
            client.disconnectedFromServer();
        }
    }

    /**
     * Метод отключающий всех клиентов от сервера
     */
    public void disconnect() {
        while (!clientsList.isEmpty()){
            disconnectUser(clientsList.get(clientsList.size()-1));
        }
    }

    /**
     * Метод возращающий историю переписки
     * из репозитория
     * @return история переаиски
     */
    public String getHistory() {
        return repository.read();
    }

    /**
     * Метод сохранения, отправки и отображеняи сообщения
     * @param text
     */
    public void message(String text){
        if (!isWork()){
            return;
        }
        ui.showMessage(text);
        answerAll(text);
        repository.save(text);
    }

    /**
     * Метод отправки сообщения всем подключенным клиентам
     * @param text текст сообщения
     */
    private void answerAll(String text){
        for (ClientController client: clientsList){
            client.answerFromServer(text);
        }
    }
}
