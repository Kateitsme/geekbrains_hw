package homework_10;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class Server {
    private static Socket clientSocket;//клиент
    private static ServerSocket server;//сервер
    private static BufferedReader in;//для ввода
    private static BufferedWriter out;//для вывода

    public static void main(String[] args) {
        try {
            try {
                server = new ServerSocket(4004);//запуск сервера на порту 4004
                System.out.println("Сервер запущен!");
                clientSocket = server.accept();//ожидание подключения
                try {
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                    String word = in.readLine();
                    System.out.println(word);
                    out.write("Введенное сообщение : " + word + "\n");
                    out.flush();//очистка буфера
                } finally {
                    clientSocket.close();
                    in.close();
                    out.close();
                }
            } finally {
                System.out.println("Сервер закрыт!");
                server.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
