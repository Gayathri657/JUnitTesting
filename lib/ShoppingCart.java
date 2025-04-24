package lib;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class cartItems {
    double price;
    int quantity;

    cartItems(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public double totalPrice() {
        double total = price * quantity;
        return total;
    }

    public void increaseQuantity(int value) {
        quantity = quantity + value;
    }

    public void decreaseQuantity(int value) {
        quantity = quantity - value;
    }

    public int totalQuantity() {
        return quantity;
    }

    public String toString() {
        return "Item Price: " + price + ", Item Quantity: " + quantity;
    }

}

class ShoppingCart {

    HashMap<String, cartItems> MyCart = new HashMap<>();

    public void addItem(String item, double price) {
        if (MyCart.containsKey(item)) {
            MyCart.get(item).increaseQuantity(1);
        } else {
            MyCart.put(item, new cartItems(price, 1));
        }

    }

    public void removeItem(String item) {
        Set<String> items = MyCart.keySet();
        if (!items.contains(item)) {
            throw new NullPointerException("Item is not found in the cart");
        } else {
            cartItems c = MyCart.get(item);
            c.decreaseQuantity(1);
            if (c.totalQuantity() <= 0) {
                MyCart.remove(item);
            }
        }
    }

    public double getTotalPrice() {
        Double total = 0.0;
        Collection<cartItems> ItemsPrice = MyCart.values();
        for (cartItems s : ItemsPrice) {
            total += s.totalPrice();
        }
        return total;
    }

    public void clearCart() {
        MyCart.clear();
    }

    // Complete the toString method to print the cart items
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, cartItems> entry : MyCart.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue().toString()).append("\n");
        }
        return sb.toString();
    }
}