package Project;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreaded {
    public void run() throws IOException {
        int port = 8010;
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(10000);
        while(true){
            try{
                System.out.println("Server is listning on port" + port);
                Socket acceptedConnection = socket.accept();
                System.out.println("Connection Accepted from Client" + acceptedConnection);
            }catch(IOException e){
                e.printStackTrace();
            }
        }

  }


    public static void main(String[] args) {

    }

}
