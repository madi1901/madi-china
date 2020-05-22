package mqdi;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Main {
    public static MainFrame frame;
    public static void connect(PackageData pd){
        try{
            Socket socket = new Socket("127.0.0.1", 2004);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            if(pd.getOperationType().equals("ADD")){
                outputStream.writeObject(pd);
            }
            else if(pd.getOperationType().equals("LIST")){
                outputStream.writeObject(pd);
                PackageData infoFromServer =(PackageData) inputStream.readObject();
                ArrayList<People> arrayListFromServer = infoFromServer.getPeoples();
                String s=" ";

                for(int i=0; i<arrayListFromServer.size(); i++){
                    s+="{"+arrayListFromServer.get(i)+"}"+" "+"ready to start"+"\n";
                }
                ListPeople.text.append(s);
            }
            else if(pd.getOperationType().equals("DELETE")){
                outputStream.writeObject(pd);
            }
            inputStream.close();
            outputStream.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        frame = new MainFrame();
        frame.setVisible(true);
    }
}