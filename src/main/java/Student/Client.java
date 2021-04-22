package Student;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;


public class Client {

    public static void main(String[] args) throws Exception
    {

        String serversAddress = "localhost";
        int serverPort = 6789;
        Socket serverSocket = new Socket(serversAddress, serverPort);
        /*
        Gson gson serve per effettivamente inizializzare il builder
         */
        GsonBuilder builder = new GsonBuilder();
        builder.serializeNulls();
        Gson gson = builder.create();

        /*
        create phantom student by hand
         */
        ArrayList<Exam> exams = new ArrayList<Exam>();
        Student student;
        Residence residence = new Residence();

        residence.setStreet("via giacomo venezian");
        residence.setNumber(6);
        residence.setCity("milan");
        residence.setCountry("italy");
        residence.setZipCode(20133);

        Exam sisop = new Exam("sisop", 29, "19/19/19");
        Exam bd = new Exam("basi di dati", 30, "12/12/12");

        exams.add(sisop);
        exams.add(bd);

        student = new Student("John", "Smith", "01.01.1900", residence, exams);
        String jsonString = gson.toJson(student);

        System.out.println(jsonString);

        DataOutputStream outToServer = new DataOutputStream(serverSocket.getOutputStream());

        outToServer.writeBytes(jsonString + "\n");

        serverSocket.close();

    }

}


