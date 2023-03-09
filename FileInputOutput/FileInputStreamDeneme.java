import java.io.FileInputStream;

// dosyalardan verileri byte cinsinden okur
// veri okuma işi bitince kapatılması gerekir
// available() -> kullanılabilir byte sayısını verir
// skip() -> belirtilen sayı kadar değeri atlayıp okuma işlemi yapar
public class FileInputStreamDeneme {

    public void run(){
        try {
            FileInputStream inputStream = new FileInputStream("test.txt");
            int i = inputStream.read();
            while (i != -1){
                System.out.print((char)i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
