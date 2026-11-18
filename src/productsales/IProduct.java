package productsales;

public interface IProduct {

    int GetTotalProductsSold(int[][] productSales);
    double GetAverageProductSold(int[][] productSales);
    String GetMostPopularProduct(int[][] productSales, String[] products);

}
