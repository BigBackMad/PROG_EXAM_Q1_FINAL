package productsales;

public class Product implements IProduct {

    @Override
    public int GetTotalProductsSold(int[][] productSales){
        int total = 0;
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                total += productSales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold(int[][] productSales){
        int total = GetTotalProductsSold(productSales);
        int count = 0;
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                count++;
            }
        }
        return (double) total / count;
    }

    @Override
    public String GetMostPopularProduct(int[][] productSales, String[] products){
        int indexOfMax = 0;
        for (int i = 0; i < totalProductSales.length; i++) {
            if (productSales[i] > productSales[indexOfMax]) {
                indexOfMax = i;
            }
        }
        return [indexOfMax];
        return ;
    }



}

