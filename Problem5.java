/* Problem Statement
Write a Java program that, given as input name, price and stock quantity of some products,
prints the filtered stream of products that have price greater than 5000.00 and stock quantity
more than 10. Complete the program as specified below.
• Class Product has/should have the following members:
– Private instance variables String name, double price and int stockQuantity
– A constructor to initialize instance variables
– Method toString to print in the format shown in the test cases
– Accessor method for price and stockQuantity
– Method productProcessor should take an ArrayList of Product objects as input
and returns a filtered stream of premium products with sufficient stock. The
criteria for filtering are:
∗ The price of the product is greater than 5000.00
∗ The stock quantity of the product is greater than 10
• Class StreamTest has the following members:
– Method main creates an ArrayList of Product objects by taking input in the
order name, price, stockQuantity then invokes the method productProcessor
to filter premium products with sufficient stock and then display those products

What you have to do
• Define method productProcessor in class Product
*/
import java.util.*;
import java.util.stream.*;
class Product {
    private String name;
    private double price;
    private int stockQuantity;
    public Product(String n, double p, int sq) {
        name = n;
        price = p;
        stockQuantity = sq;
    }
    public String toString() {
        return name + " - " + price + " - In Stock: " + stockQuantity;
    }
    public double getPrice() {
        return price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
public static Stream<Product> productProcessor
(ArrayList<Product> products) {
    return products.stream().filter(product -> product.getPrice() > 5000.00
    && product.getStockQuantity() > 10);
    }
}
public class Problem5 {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
        Product product = new Product(sc.next(),
        
        sc.nextDouble(), sc.nextInt());
        
        products.add(product);
        }
        Stream<Product> filteredStream = Product.productProcessor(products);
        System.out.println("Premium Products with Sufficient Stock:");
        filteredStream.forEach(System.out::println);
        sc.close();
        }
}
