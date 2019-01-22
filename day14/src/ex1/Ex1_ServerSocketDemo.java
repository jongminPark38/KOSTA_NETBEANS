/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author younghoonkim
 */
public class Ex1_ServerSocketDemo {
    private ServerSocket ss;
    
    public Ex1_ServerSocketDemo(int port){
        try {
            //Creates serversocket in designated port. 
            ss=new ServerSocket(port);
            executeService();
            System.out.println("server running");
        } catch (IOException ex) {
            System.out.println("port is already being used");
            Logger.getLogger(Ex1_ServerSocketDemo.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(!ss.isClosed()){
                try {
                    ss.close();
                } catch (IOException ex) {
                    Logger.getLogger(Ex1_ServerSocketDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void executeService() throws IOException {
        while(true){
            //Socket s object's address is user's address.
            //this method keeps getting input connection from client
            //and create socket to connect client to that socket.
            Socket s = ss.accept();
            //check client's IP
            InetSocketAddress isa=(InetSocketAddress) s.getRemoteSocketAddress();
            //get stream from client's socket
            InputStream is=s.getInputStream();
            OutputStream os=s.getOutputStream();
            //BufferedRead can replace this part
            
            PrintWriter pw=new PrintWriter(os);
            
            Scanner sc=new Scanner(is);
            String msg="";
                
            System.out.println("Client Message Log"+sc.nextLine());
            System.out.println(isa);
            
            pw.println("return msg");
            pw.close();
            
            
            
            s.close();
            
            
            
        }
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        new Ex1_ServerSocketDemo(9999);
    }
}