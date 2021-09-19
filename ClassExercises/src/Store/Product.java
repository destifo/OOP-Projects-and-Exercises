package Store;

public class Product {
    private String productName;
    private double productPrice;

    public Product(String productName, double productPrice){
        if (productName == null){
            throw new NullPointerException("Product name not given");
        }
        else if(productPrice < 0){
            throw new IllegalArgumentException("A price can not be a negative number");
        }
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductName() {
        return productName;
    }
}
