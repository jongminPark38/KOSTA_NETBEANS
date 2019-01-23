package GUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ServerThreadGrace implements Runnable {

    private Socket socket;
    private ServerGrace server;
    private BufferedReader br;
    private PrintWriter pw;
    private JSONParser parser;
    private final String member = "C:\\bigdataStudy\\java\\netwokrspace\\Semi_Project\\src\\GUI\\JsonGrace.json";

 
    
    //서버에서 브로드캐스팅을 하기 위해서 클라이언트와 연결된 스트림으로 통신하기 위한 PrintWriter의 주소를 제공
    public PrintWriter getPw() {
        return pw;
    }

    public ServerThreadGrace(Socket socket, ServerGrace server) {
        this.socket = socket;
        this.server = server;
        parser = new JSONParser();
        System.out.println("접속자 IP: " + socket.getInetAddress().getHostAddress());
    }

//    FileWriter fw = new FileWriter(
//                        "C:\\bigdataStudy\\java\\netwokrspace\\Semi_Project\\src\\GUI\\JsonGrace.json");
//                fw.write(members.toJSONString());
//                fw.flush();
//                fw.close();
    
    
    
    @Override
    public void run() {
        try {
            pw = new PrintWriter(socket.getOutputStream(), true);

            // readLine() 을 담당
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //사용자 소켓으로부터 메세지를 계속 받아야 한다.
            while (true) {
                String clientMsg = br.readLine();
                System.out.println(clientMsg);
                StringTokenizer stz = new StringTokenizer(clientMsg,"/");
                String token = stz.nextToken();
                if (token.equals("id_check")) {
                    // "id_check/아이디/null/null"
                    
                    JSONObject obj = (JSONObject) parser.parse(new FileReader("C:\\bigdataStudy\\java\\netwokrspace\\Semi_Project\\src\\GUI\\JsonGrace.json"));
                    Set ids = obj.keySet();
                    if (!ids.contains(stz.nextToken())) {
                        System.out.println("true");
                        pw.println("id_check/true/");
                    } else {
                        System.out.println("false");
                        pw.println("id_check/false/");
                    }
                    // 아이디 체크하는 로직
                } else if (token.equals("join")) {
                    // "join/아이디/비밀번호/연락처"
                    String id = stz.nextToken();
                    // 회원가입하는 로직
                    
                    
                }
            }
        } catch (IOException ex) {
        } catch (ParseException ex) {
        }
    }
}
