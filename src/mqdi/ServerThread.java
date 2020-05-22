package mqdi;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket){
        this.socket=socket;
    }
    public void run(){
        try{
            DBManager manager = new DBManager();
            manager.connect();

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            PackageData pd=null;
            while ((pd = (PackageData) inputStream.readObject())!=null){
                if(pd.getOperationType().equals("ADD")){
                    People peopleFromClient = pd.getPeople();
                    manager.addPeople(peopleFromClient);
                    break;
                }
                else if(pd.getOperationType().equals("LIST")){
                    ArrayList<People> infoForClient = manager.getAllPeople();
                    PackageData toClient = new PackageData(infoForClient);
                    outputStream.writeObject(toClient);
                    break;
                }
                else if(pd.getOperationType().equals("DELETE")){
                    Integer idFromClient=pd.getId();
                    manager.deletePeople(idFromClient);
                    break;
                }
            }

            inputStream.close();
            outputStream.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
