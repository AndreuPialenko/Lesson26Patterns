package Порождающие.Factoty;

public class LogisticFactor {
    static ITransport getTransportForDelivery(String name){
        ITransport transport = null;

        switch (name){
            case "truck":
                transport = new Truck();
                break;

            case "ship":
                transport = new Ship();
                break;
            default:
                System.out.println("Unknown transport type");
        }
        return transport;
    }
}
