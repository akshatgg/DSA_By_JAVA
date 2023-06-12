public class HashTableClass {
    private int size=7;
    private Node[] datamap;
    class Node{
        String key;
        Node next;
        int value;
        Node(String key,int value){
         this.key=key;
         
         this.value=value;
        }
    }
    public void HashTableClass(){
        datamap=new Node[size];
    }
    public void printall(){
        for(int i=0;i<datamap.length;i++){
          while(datamap[i]!=null){
            System.out.println(datamap[i].key + "="+datamap[i].value);
            datamap[i]=datamap[i].next;
          }
        }
    }
    public int hash(String key){
      int hash=0;
      char[] k=key.toCharArray();
      for(int i=0;i<datamap.length;i++){
        int asciiValue=k[i];
        hash=(hash+asciiValue*23)%datamap.length;
    }
    return hash;
}
}
