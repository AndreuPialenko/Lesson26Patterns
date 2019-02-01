package Порождающие.Factoty;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Enter transport type");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        ITransport transport = LogisticFactor.getTransportForDelivery(name);

        transport.deliver();
    }
}
