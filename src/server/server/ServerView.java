package server.server;

interface ServerView {
    public void showMessage(String text);
    public void disconnect();
    public void connect();
}
