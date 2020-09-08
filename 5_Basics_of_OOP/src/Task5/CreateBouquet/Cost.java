package Task5.CreateBouquet;

import Task5.Product.Product;
import Task5.Product.ProductPackaging;

import java.util.ArrayList;

public class Cost {
    int price;

    public Cost(ArrayList<Product> products, ProductPackaging productPackaging) {
        for (Product product : products) {
            if (product != null)
                price += product.getPrice();

            if(productPackaging !=null)
                price+=productPackaging.getPrice();
        }
    }

    public int getPrice() {
        return price;
    }

}
