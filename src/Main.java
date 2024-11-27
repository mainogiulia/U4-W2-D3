import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product p = new Product("The Lord of the Rings", "books", 120);
        Product p2 = new Product("The Lord of the Rings 2", "books", 90);
        Product p3 = new Product("The Lord of the Rings 3", "books", 130);
        Product p4 = new Product("The Silmarillion", "books", 80);
        Product p5 = new Product("The Hobbit", "books", 100);
        Product p6 = new Product("onesies", "baby", 70);
        Product p7 = new Product("stroller", "baby", 150);
        Product p8 = new Product("play mat", "baby", 130);
        Product p9 = new Product("diapers", "baby", 120);
        Product p10 = new Product("crib", "baby", 80);
        Product p11 = new Product("beard stuff", "boys", 100);
        Product p12 = new Product("mustache stuff", "boys", 90);
        Product p13 = new Product("boys stuff", "boys", 110);
        Product p14 = new Product("underwear", "boys", 70);
        Product p15 = new Product("clothes", "boys", 90);
        Customer c1 = new Customer("Giulia",1);
        Customer c2 = new Customer("Luca",2);
        Customer c3 = new Customer("Martina",3);
        Customer c4 = new Customer("Gabriele",2);
        Customer c5 = new Customer("Elisa",1);
        Order o1 = new Order(c1);
        Order o2 = new Order(c2);
        Order o3 = new Order(c3);
        Order o4 = new Order(c4);
        Order o5 = new Order(c5);


        o1.getProducts().add(p1);
        o1.getProducts().add(p2);




        List<Product> products = new ArrayList<>();
        products.add(p);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        products.add(p7);
        products.add(p8);
        products.add(p9);
        products.add(p10);
        products.add(p11);
        products.add(p12);
        products.add(p13);
        products.add(p14);
        products.add(p15);

        List<Product> bookProducts = products.stream()
                .filter(pr -> pr.getCategory().equals("books") && pr.getPrice() > 100).toList();

        System.out.println("EXERCISE 1: Books that are more than 100 euros");
        bookProducts.forEach(System.out::println);
        System.out.println("-------------------------------------------------");

        List<Product> babyProducts = products.stream()
                .filter(pr -> pr.getCategory().equals("baby")).toList();

        System.out.println("EXERCISE 2: All baby products");
        babyProducts.forEach(System.out::println);
        System.out.println("-------------------------------------------------");

        List<Product> boysProductsWithDiscount = products.stream()
                .filter(pr -> pr.getCategory().equals("boys"))
                .map(pr -> new Product(pr.getName(), pr.getCategory(), pr.getPrice() * 0.9)).toList();

        System.out.println("EXERCISE 3: All boys products with 10% discount");
        boysProductsWithDiscount.forEach(System.out::println);
        System.out.println("-------------------------------------------------");
    }
}