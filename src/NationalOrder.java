import template.OrderTemplate;

public class NationalOrder extends OrderTemplate {

    @Override
    protected void selectProduct() {
        System.out.println("Product selected for national delivery.");
    }

    @Override
    protected void makePayment() {
        System.out.println("Payment processed via bank transfer for national delivery.");
    }

    @Override
    protected void shipProduct() {
        System.out.println("Product shipped via national carrier.");
    }
}
