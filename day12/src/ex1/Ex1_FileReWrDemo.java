package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/** documentation주석
 */

// Buffered ==> 문자 기능. writer/reader
// String이기에, '-1'이 아닌'null
public class Ex1_FileReWrDemo {
    private String path;
    /** @see 기본 생성자, 저장경로는 window의 c....
     */
    
    public Ex1_FileReWrDemo (){
        path = "C:\\bigdataStudy\\java\\demo\\memo.txt";
    }
    /**  @param msg는 memo.txt에 BufferedWriter를 사용해서 문자열로 저장되기 위한 스트림 **/
    
    public void writeMemo(String msg){ //문자열 저장, 문자열이 append모드로 되어야 함. 
        //Buffered기능을 통해 1차 스트림과 연결
        // 버퍼 기능을 가진 문자 스트림 (2차 스트림)
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(path, true));
            // 문자 스트림을 사용해서 해당 경로의 문서에 작성
            bw.write(msg);
            bw.newLine(); // 개행
            bw.flush(); // 버퍼를 비워주는 기능
        } catch (IOException ex){
        } finally {
            if(bw != null){     //3) if문 
                try{            // 2) try 씌워주고
                    bw.close(); // 1) 먼저 타이핑 하고
                } catch(IOException ex){
            }
            }
        }
    }
               /** @return ArrayList<String>
                * 메모장의 
                */
               public ArrayList<String> getMemo() throws FileNotFoundException, IOException{
                   ArrayList<String> ar = new ArrayList<>();
                   BufferedReader br = null;
                   br = new BufferedReader(new FileReader(path));
                   String rdv = null;
                   //readLine()은 스트림을 통해서 ㅁ누자열을 한줄 단위로 읽어온다.
                   //마지막은 null
                   while((rdv= br.readLine()) != null){
                       //읽어온 문자열을 한 줄 씩 ArrayList에 저장
                       ar.add(rdv);
                   }
                   br.close();
                   return ar;
               }
        }