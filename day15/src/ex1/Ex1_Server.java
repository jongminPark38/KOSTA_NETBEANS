package ex1;
// sever : socket -> [ bind]() -> listen() ] -> accpet() -> Stream() -> close()
// bind() port socket에 대한 정보를 할당


import com.sun.corba.se.spi.activation.Server;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// listen ()  클라이언트의 접속 요청을 확인
// accpet()  클라이언트이 소켓을 생성
//ex1 Sever
// 1. SeverSocket을 생성한다.
// 2. accpet () 호출해서 접속된 Socket을 반환한다.
// 2-1. 다중접속자를 처리하기 위해서 ArrayList를 사용한다.
// 3. Socket에서 제공하는 Stream으로 통신한다.
// 3-1. readLine() 을 담당해줄 Thread 제작한다.
// 참고 - 특별한 요청이 없을때는 GUI로 서버를 제작하지는 않는다.
public class Ex1_Server {
    // 제작순서 1 SeverSocket 생성
    private ServerSocket ss;
    // 2-1 을 위한 선언
    private ArrayList<Ex1_ServerThread> cList;
    // Thread Group을 관리하기 위한 pool
    private ExecutorService executorService;
    public Ex1_Server() {
        try{
            // 서버가 접속 수 있도록 port를 오픈
            ss = new ServerSocket(9999);
            System.out.println("서버 시작");
           cList = new ArrayList<>();
           executorService = Executors.newFixedThreadPool(3);
        }catch (IOException ex){
            System.out.println("이미 사용중인 포트");
        }
    }
     public void execute(){
         // 지속해서 Socket을 받는 서비스를 해야한다.
         // 2. accpet() 호출해서 접속된 Socket 을 반환한다.
         while (true){
             Socket s;
             try {
                 s = ss.accept();
                 Ex1_ServerThread ct = new Ex1_ServerThread(s, this);
                 executorService.submit(ct);
                 Thread t = new Thread(ct);
                 cList.add(ct);
                 t.start();
                 System.out.println("Current number of Clients"
                 + cList.size());
             } catch (IOException ex) {
                 ex.printStackTrace();
             }
         }
     }       
     public static void main(String[] args) {
        Ex1_Server server = new Ex1_Server();
        server.execute();
    }
    public void sendMessage(String clientMSG){
        // 접속된 사용자는 ArrayList에 저장되어 있기 때문에
        // 그 사용자에게 토신을 해서 메세지를 각각 전송한다.
        for(Ex1_ServerThread e : cList){
            e.getPw().println(clientMSG);
        }
    }
}
