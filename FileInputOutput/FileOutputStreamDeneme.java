import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// Byte byte output için kullanılır
// append=true parametresiyle dosyaya sondan ekleme yaparak varolan değerleri korur
public class FileOutputStreamDeneme {

    public void run(){
        String text = "Output deneme \n2.satır";
        try {
            FileOutputStream outputStream = new FileOutputStream("outputStream.txt", true);
            byte[] textByte = text.getBytes();
            outputStream.write(textByte);
            outputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
