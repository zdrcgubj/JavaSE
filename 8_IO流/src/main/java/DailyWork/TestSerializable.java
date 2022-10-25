package DailyWork;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/**
 * @author Liu
 * @create 2022-10-20-20:25
 * @description:
 */
class Address implements Serializable{

    private String addressName;

    private String zipCode;

    public Address() {
    }

    public Address(String addressName, String zipCode) {
        this.addressName = addressName;
        this.zipCode = zipCode;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}

class Worker implements Serializable {

    private String name;

    private int age;

    private Address address;

    public Worker() {
    }

    public Worker(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

public class TestSerializable {

    public static void main(String args[]) throws Exception {

        Address addr = new Address("Beijing", "100000");

        Worker w = new Worker("Tom", 18, addr);

        OutputStream os = new FileOutputStream("fout.dat");

        ObjectOutputStream oout = new ObjectOutputStream(os);

        oout.writeObject(w);

        oout.close();

    }
}
