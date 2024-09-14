package server.server;

import server.client.*;
import server.repository.*;
import java.util.ArrayList;
import java.util.List;

public class ServerController {
    private Repository repository;
    private ServerView ui;
    private List<ClientController> clientsList;
    private boolean work;

    public ServerController() {
        clientsList = new ArrayList<>();
    }

    public void setRepository(Repository repos) {
        this.repository = repos;
    }

    public void setServerView(ServerView view) {
        this.ui = view;
    }

    public void setStatus(boolean status) {
        this.work = status;
    }

    public boolean isWork() {
        return this.work;
    }

    public boolean connectUser(ClientController client){
        if (!work){
            return false;
        }
        clientsList.add(client);
        return true;
    }

    public void disconnectUser(ClientController client){
        clientsList.remove(client);
        if (client != null){
            client.disconnectedFromServer();
        }
    }

    public void disconnect() {
        while (!clientsList.isEmpty()){
            disconnectUser(clientsList.get(clientsList.size()-1));
        }
    }

    public String getHistory() {
        return repository.read();
    }

    public void message(String text){
        if (!isWork()){
            return;
        }
        ui.showMessage(text);
        answerAll(text);
        repository.save(text);
    }

    private void answerAll(String text){
        for (ClientController client: clientsList){
            client.answerFromServer(text);
        }
    }
}
