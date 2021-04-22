package University;

import Student.Student;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Worker extends Thread {
    private final Socket connection;

    public Worker(Socket s) throws Exception
    {
        this.connection = s;
    }

    public void run()
    {

        System.out.printf("[%d] Processo creato.\n", this.connection.getPort());
        System.out.printf("[%d] Client connesso: %s:%d\n",
                this.connection.getPort(),
                this.connection.getInetAddress().getHostAddress(),
                this.connection.getPort());

        try {
            GsonBuilder builder = new GsonBuilder();
            builder.serializeNulls();
            builder.setPrettyPrinting();
            Gson gson = builder.create();

            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String received = inFromClient.readLine();

            Student student;
            student = gson.fromJson(received, Student.class);

            System.out.println("Ricevuta stringa JSON: " + received);
            System.out.println("Oggetto corrispondente: " + student.toString());

            connection.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
