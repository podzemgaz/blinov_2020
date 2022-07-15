//types of atributes and varibles
package by.epam.learn.order;

import by.epam.learn.order.MutableType;

//class available from other classes
public class Order {
    //class instance variable
    private long orderId;

    //class static variable
    static int bonus;
    //class instance final variable
    public final int CURRENT_RANGE = (int)(Math.random() * 42);
    // class instance final variable
    private final MutableType mutable = new MutableType(14);
    // class static final variable
    public final static int PURCHASE_TAX = 5;
    // constructors
    // methods
    public double calculatePrice (double price, int counter) {
        // local variable of the method doesh not get the default value
        double amount = (price - bonus) * counter;// initialization of local variable
        double tax = amount * PURCHASE_TAX;
        return amount + tax;
    }

    public Order(long orderId) {
        this.orderId = orderId;
    }

    public long getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", CURRENT_RANGE=" + CURRENT_RANGE +
                ", mutable=" + mutable +
                '}';
    }
}
