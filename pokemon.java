public class pokemon {
   
    String name;
    int level;
    int age;
    void attack(){
        System.out.println(name+"attack");
    }
    pokemon(){
        age=1;
    }
    pokemon(String pname,int plevel){
name=pname;
level=plevel;
    }
}

