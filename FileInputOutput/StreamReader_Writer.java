import java.io.FileInputStream;;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Karakter akışını temsil eden soyut sınıftır
// Türkçe(İngilizce olmayan karakterler) verileri okumak için iyi yoldur.
// inputstreamreader: byte cinsinden verileri char cinsinden verilere dönüştürmek için kullanılır.
// diğer i/o akışlarıyla çalışır
public class StreamReader_Writer {

    public void run(){
        String data = "Tükçe karakterler içeren cümle.";

        try {
            FileInputStream fileInput = new FileInputStream("test.txt");
            InputStreamReader fileReader = new InputStreamReader(fileInput);
            System.out.println(fileReader.getEncoding());
            int i = fileReader.read();
            while (i != -1){
                System.out.print((char)i);
                i = fileReader.read();
            }


            FileOutputStream fileOutput = new FileOutputStream("streamOutput.txt");
            OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutput);
            fileWriter.write(data);
            fileWriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
