import java.util.ArrayList;
public class HashTableClass {
  private int size = 7;
  private Node[] datamap;

  class Node {
    String key;
    Node next;
    int value;
    Node(String key, int value) {
      this.key = key;
      this.value = value;
    }
    Node(String key){
      this.key=key;
    }
  }
  HashTableClass() {
    datamap = new Node[size];
  }
  public void printall() {
    for (int i = 0; i < datamap.length; i++) {
      Node temp = datamap[i];
      System.out.println(i + ":");
      while ( temp != null) {
        System.out.println( temp.key + "=" +  temp.value);
        temp =  temp.next;
      }
    }
  }
  public int hash(String key){
    int hash = 0;
    char[] k = key.toCharArray();
    for (int i = 0; i < k.length; i++){
      int asciiValue = k[i];
      hash = (hash + (asciiValue * 23)) % datamap.length;
    }
    return hash;
  }
    public void set(String key, int value) 
    {
    int index = hash(key);
    Node newNode = new Node(key, value);
    Node tamp = datamap[index];
    if (tamp == null) {
      datamap[index]= newNode;
    } 
    else {
      
      while (tamp.next != null) { 
        tamp = tamp.next;
      }
      tamp.next = newNode;
    }
  }
  public void get(String key){
    int index = hash(key);
    Node temp=datamap[index];
    while(key!=temp.key && temp!=null){
      temp=temp.next;
    }
    if(temp!=null){
      System.out.println("find");
    }
    else{
      System.out.println("not find");
    }
  }
  public ArrayList keys(){
    ArrayList<String> allkeys=new ArrayList<>();
    for(int i=0;i<datamap.length;i++){
      Node temp=datamap[i];
      while(temp!=null){
        allkeys.add(temp.key);
        temp=temp.next;
      }
    }
    return allkeys;

  }
}
