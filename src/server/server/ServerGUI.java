package server.server;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Класс описывающий работу графического интерфейса приложения.
 * Является абстракцией GUI
 */
public class ServerGUI extends JFrame implements ServerView {
    /**
     * Контроллер, описывающий реакцию на различные события.
     * Когда что-то происходит, например нажата какая-то кнопка на экране, то обращаемся
     * к контроллеру и вызываем нужный метод
     */    
    private ServerController server;

    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private JButton btnStart, btnStop;
    private JTextArea windowInfo;

    public void setServer(ServerController srv) {
        this.server = srv;
    }

    /**
     * Конструктор класса
     */
    public ServerGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat server");
        setLocationRelativeTo(null);

        createPanel();
        setVisible(true);
    }

    /**
     * Метод добавления виджетов на экран
     */
    private void createPanel() {
        windowInfo = new JTextArea();
        add(windowInfo);
        add(createButtons(), BorderLayout.SOUTH);
    }

    /**
     * Метод создания панели с клавишами управления сервером
     * @return возвращает созданную панель
     */
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

    /**
     * Метод запускающий сервер
     */
    public void connect() {
        if (server.isWork()){
            appendToWindowInfo("Сервер уже был запущен");
        } else {
            server.setStatus(true);
            appendToWindowInfo("Сервер запущен!");
        }
    }

    /**
     * Метод останавливающий сервер
     */
    public void disconnect() {
        if (!server.isWork()){
            appendToWindowInfo("Сервер уже был остановлен");
        } else {
            server.setStatus(false);
            server.disconnect();
            appendToWindowInfo("Сервер остановлен!");
        }
    }

    /**
     * Метод отображающий сообщения в
     * информационном окне сервера
     * @param text Текст сообщения
     */
    public void showMessage(String text) {
        windowInfo.append(text + "\n");
    }

    /**
     * Метод отображающий служебные сообщения
     * в информационном окне сервера
     * @param text Текст сообщения
     */
    private void appendToWindowInfo(String text){
        windowInfo.append(text + "\n");
    }
}
