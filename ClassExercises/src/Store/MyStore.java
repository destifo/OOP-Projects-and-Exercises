//package Store;
//
//import java.util.*;
//
//public class MyStore {
//    private ArrayList<Product> products = new ArrayList<Product>();
//
//    public MyStore(){
//
//    }
//
//    public void readProducts() throws ProductException{
//        System.out.println("Please Enter the product name and its price accordingly");
//        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Product name: ");
//            String tempName = sc.next();
//            System.out.println("Price: ");
//            double tempPrice = sc.nextInt();
//            sc.close();
//
//            Product tempProduct = new Product(tempName, tempPrice);
//
//            products.add(tempProduct);
////        }catch(ProductException ex){
////            System.out.println(ex.getMessage());
////        }
////
////
////    }
////
////    public static void main(String[] args) throws ProductException {
////        MyStore instance1 = new MyStore();
////
////            instance1.readProducts();
////
////
////    }
//
//
//}
