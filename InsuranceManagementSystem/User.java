import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class User {

    private String name, email, password, job;
    private int age;
    Date date;
    ArrayList<Address> addressList = new ArrayList<Address>();

    public User(String name, String email, String password, String job, int age, ArrayList<Address> addressList) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.addressList = addressList;
        date = new Date();
        date = Date.from(Instant.now());
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public String getJob() {return job;}
    public void setJob(String job) {this.job = job;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public Date getDate() {return date;}
    public void setDate(Date date) {this.date = date;}
    public ArrayList<Address> getAddressList() {return addressList;}
    public void setAddressList(ArrayList<Address> addressList) {this.addressList = addressList;}


}
