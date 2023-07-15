public class BinarysearchTree {
    public static void main(String[] args){
        BinarysearchTreeClass mybst= new BinarysearchTreeClass(); 
    mybst.insert(47);
        mybst.insert(21);
    mybst.insert(76);
    mybst.insert(18);
    mybst.insert(27);
    mybst.insert(52);
    mybst.insert(82);
    System.out.println(mybst.BST());
    System.out.println(mybst.preorder());
    System.out.println(mybst.postorder());
    System.out.println(mybst.inorder());
    }
}
