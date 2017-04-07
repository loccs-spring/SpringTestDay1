package cn.edu.sjtu.property;
import java.util.List;

/**
 * Created by spring on 2017/3/27.
 */
public class Address {
    public String flatNo;
    public String bldgNo;
    public String streetNo;
    public String city;
    public int pincode;

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        System.out.println("Setter method is called");
        this.streetNo = streetNo;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getBldgNo() {
        return bldgNo;
    }

    public void setBldgNo(String bldgNo) {
        this.bldgNo = bldgNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    Address(String flatNo, String bldgNo, String streetNo, String city, int pincode) {
        super();
        System.out.println("Constructor with multiple argument invoked");
        this.flatNo = flatNo;
        this.bldgNo = bldgNo;
        this.streetNo = streetNo;
        this.city = city;
        this.pincode = pincode;
    }

    Address(List l1) {
        super();
        System.out.println("Constructor with Single List argument invoked");
        this.flatNo = (String) l1.get(0);
        this.bldgNo = (String) l1.get(1);
        this.streetNo = (String) l1.get(2);
        this.city = (String) l1.get(3);
        this.pincode = Integer.parseInt((String) l1.get(4));
    }

    @Override
    public String toString() {
        return "Address [flatNo=" + flatNo
                + ", bldgNo="
                + bldgNo
                + ", streetNo=" + streetNo + ", city=" + city + ", pincode="
                + pincode + "]";
    }


}
