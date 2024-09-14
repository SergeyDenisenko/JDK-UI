package server.server;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerGUI extends JFrame implements ServerView {
    private ServerController server;

    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private JButton btnStart, btnStop;
    private JTextArea windowInfo;

    public void setServer(ServerController srv) {
        this.server = srv;
    }

    public ServerGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat server");
        setLocationRelativeTo(null);

        createPanel();

        setVisible(true);
    }

    private void createPanel() {
        windowInfo = new JTextArea();
        add(windowInfo);
        add(createButtons(), BorderLayout.SOUTH);
    }

    private Component createButtons() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connect();
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disconnect();
            }
        });

        panel.add(btnStart);
        panel.add(btnStop);
        return panel;
    }

    public void connect() {
        if (server.isWork()){
            appendToWindowInfo("Сервер уже был запущен");
        } else {
            server.setStatus(true);
            appendToWindowInfo("Сервер запущен!");
        }
    }

    public void disconnect() {
        if (!server.isWork()){
            appendToWindowInfo("Сервер уже был остановлен");
        } else {
            server.setStatus(false);
            server.disconnect();
            appendToWindowInfo("Сервер остановлен!");
        }
    }

    public void showMessage(String text) {
        windowInfo.append(text + "\n");
    }

    private void appendToWindowInfo(String text){
        windowInfo.append(text + "\n");
    }
}
