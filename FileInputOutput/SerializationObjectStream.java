import java.io.Serializable;

/*
Herhangi bir sınıftan nesne üretip onu dosyaya yazdırıp tekrar dosyadan kullanmaya çalıştığımızda
değerlerin tip bilgilerini tutamama sorunu vardır. Bu sorun Serialization ile çözülür.
*/
public class SerializationObjectStream implements Serializable {
    String carName;
    String carModel;

    public SerializationObjectStream(String carName, String carModel) {
        this.carName = carName;
        this.carModel = carModel;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }


}
