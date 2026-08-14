import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Cloth cloth = new Cloth();
            cloth.setMeasurement(6);
        }
        catch (LongShirtException e) {
            System.out.println(e.getMessage());
        }
    }
}