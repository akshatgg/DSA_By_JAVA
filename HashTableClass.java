import javax.sql.rowset.spi.SyncResolver;

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
  }

  public HashTableClass() {
    datamap = new Node[size];
  }

  public void printall() {
    for (int i = 0; i < datamap.length; i++) {
      Node temp = datamap[i];
      System.out.println(i + ":");
      while (datamap[i] != null) {
        System.out.println(datamap[i].key + "=" + datamap[i].value);
        datamap[i] = datamap[i].next;
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
      while (tamp != null) { 
        tamp = tamp.next;
      }
      tamp = newNode;
    }
  }
}
