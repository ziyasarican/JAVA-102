import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// verileri byte olarak daha verimli okumak için tampon olarak kullanılır
public class BufferedStreams {

    public void run(){
        try {
            FileInputStream fileInput = new FileInputStream("test.txt");
            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);

            int i = bufferedInput.read();
            while (i != -1) {
                System.out.print((char)i);
                i = bufferedInput.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
