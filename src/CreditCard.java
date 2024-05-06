import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<Shopping> shopping;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.shopping = new ArrayList<>();
    }

    public boolean throwShopping(Shopping shopping){
        if(this.balance > shopping.getValue()) {
            this.balance -= shopping.getValue();
            this.shopping.add(shopping);
            return true;
        } else {
            return false;
        }
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Shopping> getShopping() {
        return shopping;
    }
}
