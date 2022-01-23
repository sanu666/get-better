package DecInterviewArchive;

public class Singleton {

    private static Singleton  singleton=null;
    private Singleton(){
    }

    public synchronized static Singleton getInstance(){
        if(singleton==null){
          return new Singleton();
        }
        return singleton;
    }

//sych check singleton

}
