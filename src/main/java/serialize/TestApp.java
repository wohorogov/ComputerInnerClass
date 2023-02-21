package serialize;

import inner.Computer;

import java.io.*;

public class TestApp {
    public static final String PATH = "/Users/wohorogov/Downloads/myComputer";
    public void serializable(String path, Computer computer) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(computer);
        objectOutputStream.close();
    }
    public Computer deserializable(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        Computer computer = (Computer) (objectInputStream.readObject());
        objectInputStream.close();
        return computer;
    }
    public void start() throws IOException, ClassNotFoundException {
        Computer computer = new Computer();
        serializable(PATH, computer);
        Computer comp = deserializable(PATH);
        System.out.println(comp.toString());
    }
}
