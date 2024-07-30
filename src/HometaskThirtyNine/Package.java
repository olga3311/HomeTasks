package HometaskThirtyNine;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Package {
    private String senderAddress;
    private String shippingAddress;
    private double weight;
    public ZonedDateTime dateTime;

    public Package(String senderAddress, String shippingAddress, double weight, ZonedDateTime dateTime) {
        this.senderAddress = senderAddress;
        this.shippingAddress = shippingAddress;
        this.weight = weight;
        this.dateTime = dateTime;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public ZonedDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Package{" +
                "senderAddress='" + senderAddress + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", weight=" + weight +
                ", dateTime=" + dateTime +
                '}';
    }
}
