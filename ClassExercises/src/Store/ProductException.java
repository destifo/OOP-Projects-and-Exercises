package Store;

import java.io.IOException;

public class ProductException extends IOException {

    public ProductException(){}

    public ProductException(String error){
        super(error);
    }

}
