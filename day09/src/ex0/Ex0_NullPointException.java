
package ex0;

import ex1.MyInter;

public class Ex0_NullPointException {
    private MyInter inter;
    public Ex0_NullPointException(MyInter inter){
        this.inter = inter;
    }
public void execute(){
    // ���� �߻�
    inter.myMethod();
}
    public static void main(String[] args) {
        MyInter inter = null;
        new Ex0_NullPointException(inter).execute();
    }
}
