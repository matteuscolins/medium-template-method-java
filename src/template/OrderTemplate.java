package template;

public abstract class OrderTemplate {

    public final void processOrder() {
        selectProduct();
        makePayment();
        shipProduct();
        generateInvoice();
    }

    protected abstract void selectProduct();
    protected abstract void makePayment();
    protected abstract void shipProduct();

    private void generateInvoice() {
        System.out.println("Generating standard invoice.");
    }
}
