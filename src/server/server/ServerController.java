package server.server;

import server.repository.*;

public class ServerController {
    private Repository repository;
    private ServerView ui;

    public void setRepository(Repository repos) {
        this.repository = repos;
    }

    public void setServerView(ServerView view) {
        this.ui = view;
    }
}
