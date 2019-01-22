
package ex1;


import java.util.ArrayList;
import java.util.Iterator;

public class Ex3_ArrayList {
    private ArrayList <String> list;
    private ArrayList<Member> memberList;
    public Ex3_ArrayList(){
        list = new ArrayList<>();
//for (int i = 0; i<3; i++ ){
//    Member m = new Member();
//    m.setId("xman"+i);
//    m.setAge(30+i);
////    mlist.add(m);
    Member member = new Member();
    member.setAge(20);
    member.setId("idid");
    member.setName("pp");
    
   memberList = new ArrayList<>();
   memberList.add(member);
   
   memberList.add(new Member("ppp","idididi", 20));
    

} //¿ä°Åµµ ¸ø¾¸
    }
    