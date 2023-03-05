public interface Address {
    public void getAddress(String address);
}

class HomeAddress implements Address{
    private String address;

    public HomeAddress(String address) {
        this.address = address;
    }


    @Override
    public void getAddress(String address) {

    }
}


class BusinessAddress implements Address{
    private String address;

    public BusinessAddress(String address) {
        this.address = address;
    }

    @Override
    public void getAddress(String address) {

    }
}

class AddressManager {
    public static void addAddress(User user, Address address) {
        user.getAddressList().add(address);
    }
    public static void removeAddress(User user, Address address) {
        user.getAddressList().remove(address);
    }
}
