public class HashTable {
    public static void main(String[] args){
    HashTableClass mytable=new HashTableClass();
   mytable.set("tails", 50);
    mytable.set("nails",100);
    mytable.set("bolts",200);
    mytable.printall();
    mytable.get("tails");
   System.out.println( mytable.keys());
}
}
