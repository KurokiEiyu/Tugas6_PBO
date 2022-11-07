package PBO2Sesi6;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Laptop thinkpad = new Lenovo();
        LaptopUser andri = new LaptopUser(thinkpad);
        Laptop toshiba = new Toshiba();
        LaptopUser andra = new LaptopUser(toshiba);
        Laptop macbook = new MacBook();
        LaptopUser andru = new LaptopUser(macbook);

        andri.turnOnLaptop();
        andri.makeLaptopLouder();
        andri.makeLaptopLouder();
        andri.makeLaptopSilence();
        andri.turnOffLaptop();
        andra.turnOnLaptop();
        andra.makeLaptopLouder();
        andra.makeLaptopLouder();
        andra.makeLaptopSilence();
        andra.turnOffLaptop();
        andru.turnOnLaptop();
        andru.makeLaptopLouder();
        andru.makeLaptopLouder();
        andru.makeLaptopSilence();
        andru.turnOffLaptop();
    }
}
