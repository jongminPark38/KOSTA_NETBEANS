package ex1;


import com.sun.corba.se.spi.activation.Server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Ex1_ServerThread implements Runnable{
    private Socket socket;
    private Ex1_Server server;
    private BufferedReader br;
    private PrintWriter pw;
    // �������� ��ε�ĳ������ �ϱ� ���ؼ�
    // Ŭ���̾�Ʈ�� ����� ��Ʈ������ ����ϱ� ����
    // PrintWriter�� �ּҸ� �����Ѵ�

    public PrintWriter getPw() {
        return pw;
    }

    
    public Ex1_ServerThread (Socket socket, Ex1_Server server){
        this.socket = socket;
        this.server = server;
    }

    @Override
    public void run() {
       try{
           pw = new PrintWriter(socket.getOutputStream(), true);
           // ������� �� ���
           br = new BufferedReader(
                   new InputStreamReader(
                           socket.getInputStream()));
           // ����� �������� ���� �޽����� ��� �޾ƾ��Ѵ�.
          while (true) {
              String clientMSG = br.readLine();
              System.out.println("Log :" +clientMSG);
              server.sendMessage(clientMSG);
          }
       }catch (IOException ex){
    }
}
}
