package productsales;
import java.util.Scanner;

import java.sql.SQLOutput;

public class ProductApp {

    public static void main(String[] args) {

            String[] products = {"Cozy Nights Monarch mattress","Restonic Barbados mattress","Sealy Pucket mattress"};
            String months[] = {"month 1","month 2","month 3"};
            int[][] productSales = new int[3][3];

        String STARS = "*".repeat(50);


        for (int i = 0; i < products.length; i++) {
                for (int j = 0; j < products.length; j++) {
                    System.out.print("Enter the number for " + months[j] + " for " +  products[i] + ": ");
                    productSales[i][j] = new Scanner(System.in).nextInt();
                }
                System.out.println();
            }

        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println(STARS);

        Product product = new  Product();

        int totalProductSales = product.GetTotalProductsSold(productSales);
        double averageProductSold = Math.round(product.GetAverageProductSold(productSales));
        String mostPopularProduct = product.GetMostPopularProduct(productSales, products);

        System.out.println("TOTAL PRODUCT SALES:\t" + totalProductSales);
        System.out.println("AVERAGE PRODUCT SALES:\t" + averageProductSold);
        System.out.println("MOST POPULAR PRODUCT:\t" + mostPopularProduct);
        System.out.println(STARS);


    }
}
