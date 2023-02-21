package file;

import java.io.*;

public class TestApp {
    public void start() throws FileNotFoundException {

        try (InputStream inputStream = new FileInputStream("/Users/wohorogov/Downloads/test.rtf")){
            OutputStream outputStream = new FileOutputStream("/Users/wohorogov/Downloads/testNew.rtf");
            byte[] buffer = new byte[1024];
            int hasRead = 0;
            while (inputStream.available() > 0) {
                int read = inputStream.read(buffer);
                outputStream.write(buffer, 0, read);
                hasRead += read;
            }
            outputStream.close();
            System.out.println(hasRead);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
