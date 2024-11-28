import entity.Customer;
import entity.Order;
import entity.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        es1();
        System.out.println("\n----------------------------------------------\n");
        es2();
        System.out.println("\n----------------------------------------------\n");
        es3();
        System.out.println("\n----------------------------------------------\n");
        System.out.println(es4());
    }

    public static List<Product> magazzino = new ArrayList();
    public static List<Customer> listaClienti = new ArrayList();
    public static List<Order> orders = new ArrayList();


    public static void es1(){
        Product prodotto1 = new Product("Books", "un bel libro", 20.50, 1);
        Product prodotto4 = new Product("Books", "un bellissimo libro", 200.50, 1);
        Product prodotto2 = new Product("Baby", "pupazzo", 50.50, 2);
        Product prodotto3 = new Product("Boys", "guns", 20.50, 3);
        Customer cust1 = new Customer(1, "Rossi", 2);
        Customer cust2 = new Customer(2, "Verdi", 2);
        Customer cust3 = new Customer(3, "Gialli", 3);
        Order order1 =  new Order(cust1);
        Order order2 =  new Order(cust1);
        Order order3 =  new Order(cust2);
        Order order4 =  new Order(cust3);




        order1.setOrderDate(LocalDate.now());
        order1.setDeliveryDate(LocalDate.of(2024, 11, 30));
        order1.getProducts().add(prodotto1);
        order1.getProducts().add(prodotto2);
        order1.getProducts().add(prodotto3);

        order2.setOrderDate(LocalDate.of(2022, 10, 30));
        order2.setDeliveryDate(LocalDate.of(2023, 11, 30));
        order2.getProducts().add(prodotto1);
        order2.getProducts().add(prodotto2);
        order2.getProducts().add(prodotto3);
        order2.getProducts().add(prodotto4);




        magazzino.addAll(Arrays.asList(prodotto1,prodotto2,prodotto3,prodotto4));
        orders.addAll(Arrays.asList(order1,order2));
        listaClienti.addAll(Arrays.asList(cust1,cust2,cust3));

        magazzino.stream()
                .filter(p-> p.getPrice() > 100 && p.getCategory().equals("Books"))
                .forEach(System.out::println);
    }

    public static void es2(){
        magazzino.stream().filter(p-> p.getCategory().equals("Baby"))
                .forEach(System.out::println);
    }

    public static void es3(){
        magazzino.stream().filter(p-> p.getCategory().equals("Boys"))
                .map(p-> {
                    double discountPrice= p.getPrice() * 0.9;
                    p.setPrice(discountPrice);
                    return p;
                })
                .forEach(System.out::println);
    }

    public static List<Product> es4(){
        //assegno lo stream traformato con .tolist()
        List<Order>orderList = orders.stream().filter(order -> order.getCustomer().getTier() == 2).toList();

        List<Product> products = new ArrayList<>();
        for(Order ord : orderList){
            products.addAll(ord.getProducts());
        }
        return products;
    }
}