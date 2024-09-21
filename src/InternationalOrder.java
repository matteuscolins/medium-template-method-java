import template.OrderTemplate;

public class InternationalOrder extends OrderTemplate {

    @Override
    protected void selectProduct() {
        System.out.println("Product selected for international delivery.");
    }

    @Override
    protected void makePayment() {
        System.out.println("Payment processed via PayPal for international delivery.");
    }

    @Override
    protected void shipProduct() {
        System.out.println("Product shipped via international carrier.");
    }
}
