public class Tree {
    public static void main(String[] args){
     TreeClass myTC=new TreeClass();
    //  myTC.TreeClass(47);
     myTC.insert(47);

     myTC.insert(21);
     myTC.insert(76);
     myTC.insert(18);
     myTC.insert(52);
     myTC.insert(82);
     myTC.insert(27);


     System.out.println(myTC.root.left.right.data);
     System.out.println(myTC.contains(27));
     System.out.println(myTC.contains(67));

}
}