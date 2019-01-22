package ex1;
// sever : socket -> [ bind]() -> listen() ] -> accpet() -> Stream() -> close()
// bind() port socket�� ���� ������ �Ҵ�


import com.sun.corba.se.spi.activation.Server;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// listen ()  Ŭ���̾�Ʈ�� ���� ��û�� Ȯ��
// accpet()  Ŭ���̾�Ʈ�� ������ ����
//ex1 Sever
// 1. SeverSocket�� �����Ѵ�.
// 2. accpet () ȣ���ؼ� ���ӵ� Socket�� ��ȯ�Ѵ�.
// 2-1. ���������ڸ� ó���ϱ� ���ؼ� ArrayList�� ����Ѵ�.
// 3. Socket���� �����ϴ� Stream���� ����Ѵ�.
// 3-1. readLine() �� ������� Thread �����Ѵ�.
// ���� - Ư���� ��û�� �������� GUI�� ������ ���������� �ʴ´�.
public class Ex1_Server {
    // ���ۼ��� 1 SeverSocket ����
    private ServerSocket ss;
    // 2-1 �� ���� ����
    private ArrayList<Ex1_ServerThread> cList;
    // Thread Group�� �����ϱ� ���� pool
    private ExecutorService executorService;
    public Ex1_Server() {
        try{
            // ������ ���� �� �ֵ��� port�� ����
            ss = new ServerSocket(9999);
            System.out.println("���� ����");
           cList = new ArrayList<>();
           executorService = Executors.newFixedThreadPool(3);
        }catch (IOException ex){
            System.out.println("�̹� ������� ��Ʈ");
        }
    }
     public void execute(){
         // �����ؼ� Socket�� �޴� ���񽺸� �ؾ��Ѵ�.
         // 2. accpet() ȣ���ؼ� ���ӵ� Socket �� ��ȯ�Ѵ�.
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
        // ���ӵ� ����ڴ� ArrayList�� ����Ǿ� �ֱ� ������
        // �� ����ڿ��� ����� �ؼ� �޼����� ���� �����Ѵ�.
        for(Ex1_ServerThread e : cList){
            e.getPw().println(clientMSG);
        }
    }
}
