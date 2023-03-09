import java.io.*;

public class Main {
    public static void main(String[] args) {

        File file = new File("src/deneme.txt");
        try {
            file.createNewFile(); // olmayan bir dosyası oluşturulur
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        file.delete(); // dosyayı siler

        //Yeni bir dosya yaratmak için
        File dizin = new File("test");
        dizin.mkdir();
        File file2 = new File("test/deneme.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        FileInputStreamDeneme fileInputStreamDeneme = new FileInputStreamDeneme();
        fileInputStreamDeneme.run();

        FileOutputStreamDeneme fileOutputStreamDeneme = new FileOutputStreamDeneme();
        fileOutputStreamDeneme.run();

        ByteArrayInput_Output byteArrayInput_output = new ByteArrayInput_Output();
        byteArrayInput_output.inputRun();
        byteArrayInput_output.outputRun();


        SerializationObjectStream car = new SerializationObjectStream("Audi", "A6");
        try {
            // nesneyi dosyaya yazma
            FileOutputStream fileOutputStream = new FileOutputStream("araba.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(car);
            outputStream.close();

            //dosyadan nesneyi okuma
            FileInputStream fileInputStream = new FileInputStream("araba.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            SerializationObjectStream newCar = (SerializationObjectStream) objectInputStream.readObject();
            System.out.println(newCar.getCarModel() + " " + newCar.getCarName());
            objectInputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        BufferedStreams bufferedStreams = new BufferedStreams();
        bufferedStreams.run();

        StreamReader_Writer reader = new StreamReader_Writer();
        reader.run();

        BufferedReader_Writer bufferedReader_Writer = new BufferedReader_Writer();
        bufferedReader_Writer.run();

    }
}