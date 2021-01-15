package lesson10HW;

import com.sun.org.apache.xpath.internal.operations.Or;
import lesson10.abstractbigexample.Employee;
import lesson10.polyexample.Human;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer("Nastia", "Kiev", "female");
        Customer customer2 = new Customer("Anton", "Odessa", "male");
        Customer customer3 = new Customer("Test", "Odessa", "male");

        //check shippingPrice for Kiev and Odessa
        //check shippingPrice if not Kiev and Odessa
        //test gender
        //shippingToCity is wrong
        //shippingFromCity is wrong
        //check basePrice < 100
        //check basePrice > 1000

        Order[] orders = {
                new ElectronicsOrder("laptop", new Date(), "Kiev", "Odessa", 100, customer, 2),
                new ElectronicsOrder("phone", new Date(), "Dnepr", "Kharkov", 100, customer, 1),
                new ElectronicsOrder("headphones", new Date(), "Dnepr", "Kiev", 100, customer2, 1),
                new ElectronicsOrder("laptop", new Date(), "Kiev", "Kanev", 100, customer, 2),
                new ElectronicsOrder("powerBank", new Date(), "Kanev", "Kharkov", 100, customer, 2),
                new ElectronicsOrder("powerBank", new Date(), "Dnepr", "Kharkov", 90, customer, 2),
                new ElectronicsOrder("powerBank", new Date(), "Dnepr", "Kharkov", 1001, customer, 2),

                new FurnitureOrder("door knob", new Date(), "Kiev", "Kharkov", 500, customer, "676789"),
                new FurnitureOrder("door knob", new Date(), "Lvov", "Kharkov", 500, customer, "676789"),
                new FurnitureOrder("door knob", new Date(), "Kanev", "Kharkov", 500, customer, "676789"),
                new FurnitureOrder("door knob", new Date(), "Kiev", "Kharkov", 499, customer2, "676789"),
                new FurnitureOrder("door knob", new Date(), "Kiev", "Kharkov", 500, customer3, "676789"),
                new FurnitureOrder("door knob", new Date(), "Kiev", "Kharkov", 5001, customer, "676789"),
        };

        for (Order el : orders) {
            if (el instanceof FurnitureOrder) {
                System.out.println("\n_____________________FurnitureOrders_______________________\n");
            }
            el.validateOrder();
            System.out.println("\n\n" + el.toString());
            el.calculatePrice();
            System.out.println("\n\n" + el.toString());
        }
    }
}
