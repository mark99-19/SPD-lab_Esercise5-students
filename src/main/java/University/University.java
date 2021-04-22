package University;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class University {

    public static void main(String[] args) throws Exception
    {
        ServerSocket welcomeSocket = new ServerSocket(6789);

        while(true){
            Socket connection = welcomeSocket.accept();
            Worker worker = new Worker(connection);
            worker.start();
        }
    }

}

