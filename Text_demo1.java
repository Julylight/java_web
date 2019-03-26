import java.util.*;

class Text_1{
  public static void main(String[] args) {
    //Integer a = new Integer(50);            //从新的地址值取值
    //Integer b = new Integer(50);            //开辟新空间取值
    Integer a = 127;
    Integer b = 127;
    System.out.println(a);
    System.out.println(b);
    System.out.println(a == b);
  }
}
