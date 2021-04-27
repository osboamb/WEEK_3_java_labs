public class Person {
    private String name;
    private String address;
    private String phone;

//CONSTRUCTOR
    public Person() {
        name = "";
        address = "";
        phone = "";
    }

    public Person(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

//GETTERS & SETTERS 
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

//To String 
    public String toString() {
        return name + "\n" + address + "\n" + phone + "\n";
    }
}