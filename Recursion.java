public class Recursion{
    public static void Onemethod(){
       Twomethod();
       System.out.println("one");
    }
    public static void Twomethod(){
        Thirdmethod();
        System.out.println("two");
    }
    public static void Thirdmethod(){
        System.out.println("third");
    }
    public static void main (String[] args){
Onemethod();
    }
}