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
    // 서버에서 브로드캐스팅을 하기 위해서
    // 클라이언트와 연결된 스트림으로 통신하기 우힌
    // PrintWriter의 주소를 제공한다

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
           // 리드라인 을 담당
           br = new BufferedReader(
                   new InputStreamReader(
                           socket.getInputStream()));
           // 사용자 소켓으로 부터 메시지를 계속 받아야한다.
          while (true) {
              String clientMSG = br.readLine();
              System.out.println("Log :" +clientMSG);
              server.sendMessage(clientMSG);
          }
       }catch (IOException ex){
    }
}
}
