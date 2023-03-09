import java.io.*;

// dosya okurken/yazarken ara sınıf olarak kullanıp tamponlama yapılır
// en sık kullanılandır
public class BufferedReader_Writer {

    public void run(){

        String data = "buffered deneme";
        try {
            FileReader fileReader = new FileReader("test.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // satır satır okuma yapılabilir
            String line = bufferedReader.readLine();
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            FileWriter fileWriter = new FileWriter("bufferedOutput.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
