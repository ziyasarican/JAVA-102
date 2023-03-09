import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Bir dizi girdiyi byte olarak okur
public class ByteArrayInput_Output {

    public void inputRun(){
        byte[] arr = {1,2,3,4,5};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);
        int i = byteArrayInputStream.read();
        while(i != -1){
            System.out.println(i);
            i = byteArrayInputStream.read();
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void outputRun() {
        String data = "Output deneme txt";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream( );
        byte[] dataBytes = data.getBytes();
        try {
            byteArrayOutputStream.write(dataBytes);
            String newData = byteArrayOutputStream.toString();
            System.out.println("Çıkış: " + newData);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
