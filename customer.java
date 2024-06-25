import java.util.Scanner;
public class customer{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String name;
    int price;
    int quantity;
    int total;
    int discount;
    int gst;

    System.out.println("|*********|");
    System.out.print("|Enter user name| = ");
    name = in.nextLine();
    System.out.print("|Enter price| = ");
    price = in.nextInt();
    System.out.print("|Quantity| = ");
    quantity = in.nextInt();
    total = price*quantity;
    System.out.println("|Total price| = "+total);
    System.out.print("|Enter Discount| = ");
    discount = in.nextInt();
    discount = (total*discount)/100;
    total = (total - discount);
    System.out.println("|Total price with discount| = "+total);
    System.out.print("|Enter GST| = ");
    gst = in.nextInt();
    gst = (total*gst)/100;
    total = (total+gst);
    System.out.print("|Final price| = " +total);

    }
}
 