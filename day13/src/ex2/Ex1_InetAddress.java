
package ex2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Ex1_InetAddress  implements Ex1_InetAddressInter{
    private InetAddress[] ar;  //서버가 도메인 여러개의 서비스를 가질 경우
    @Override
    public void searchDomain(String ns) 
            throws UnknownHostException {
        ar =  InetAddress.getAllByName(ns);
    }
    @Override
    public ArrayList<String> getDomainList() {
        ArrayList<String> list = new ArrayList<>();
        for(InetAddress e : ar){
            list.add(e.getHostAddress());
        }
                return list;
    }
}
