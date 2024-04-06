package DesignPatterns.Singleton;

public class DBConn {
    int limit=3;
    int currentConnection=0;
    public static DBConn instance;
    private DBConn(){}
    public static DBConn getDBConnObj(){
        if(instance==null){
            instance=new DBConn();
        }
        return instance;
    }

    public boolean connect(){
        if(currentConnection<limit){
            currentConnection++;
            return true;
        }
        return false;
    }
}
