import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private double insurancePrice;
    private Date insuranceDate;
    private User user;

    public Insurance(String insuranceName, double insurancePrice, Date insuranceDate, User user) {
        this.insuranceName = insuranceName;
        this.insurancePrice = insurancePrice;
        this.insuranceDate = insuranceDate;
        this.user = user;
    }

    public String getInsuranceName() {return insuranceName;}
    public void setInsuranceName(String insuranceName) {this.insuranceName = insuranceName;}
    public double getInsurancePrice() {return insurancePrice;}
    public void setInsurancePrice(double insurancePrice) {this.insurancePrice = insurancePrice;}
    public Date getInsuranceDate() {return insuranceDate;}
    public void setInsuranceDate(Date insuranceDate) {this.insuranceDate = insuranceDate;}
    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}

    public final void showUserInfo(){
        System.out.println("---Hesap Bilgileri---");
        System.out.println("Adı: " + this.getUser().getName());
        System.out.println("E mail: " + this.getUser().getEmail());
        for(Address address : this.getUser().getAddressList()){
            System.out.println("Adres: " + address);
        }
    }
    public abstract void calculate();
}

class HealthInsurance extends Insurance{
    public HealthInsurance(String insuranceName, double insurancePrice, Date insuranceDate, User user) {
        super(insuranceName, insurancePrice, insuranceDate, user);
    }
    @Override
    public void calculate() {
        System.out.println("Health Insurance Calculating");
    }
}

class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(String insuranceName, double insurancePrice, Date insuranceDate, User user) {
        super(insuranceName, insurancePrice, insuranceDate, user);
    }
    @Override
    public void calculate() {
        System.out.println("Residence Insurance Calculating");
    }
}

class TravelInsurance extends Insurance{
    public TravelInsurance(String insuranceName, double insurancePrice, Date insuranceDate, User user) {
        super(insuranceName, insurancePrice, insuranceDate, user);
    }
    @Override
    public void calculate() {
        System.out.println("Healt Insurance Calculating");
    }
}

class CarInsurance extends Insurance{
    public CarInsurance(String insuranceName, double insurancePrice, Date insuranceDate, User user) {
        super(insuranceName, insurancePrice, insuranceDate, user);
    }
    @Override
    public void calculate() {
        System.out.println("Healt Insurance Calculating");
    }
}
