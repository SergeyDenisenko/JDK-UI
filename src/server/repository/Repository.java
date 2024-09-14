package server.repository;

interface Repository {
    public void save(String text);
    public String read();
}
