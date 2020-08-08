/*
 * Copyright (c) 2020.
 *
 * Author : Shivam Kumar
 * All rights reserved.
 *
 */

import java.util.ArrayList;
import java.util.List;

public class SpecificationPattern {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add( new Product(Color.BLUE, "House", Size.LARGE));
        products.add(new Product(Color.RED, "car", Size.SMALL));
        products.add(new Product(Color.BLUE, "Plane", Size.MEDIUM));
        Filter<Product> filter = new Filter<Product>();
        ColorSpecification colorSpecification = new ColorSpecification(Color.BLUE);
        List<Product> blueProducts = filter.filter(products, colorSpecification);
        System.out.println("blue products");
        System.out.println(blueProducts.toString());

        System.out.println("Large products");
        List<Product> largeProducts = filter.filter(products, new SizeSpecification(Size.LARGE));
        System.out.println(largeProducts.toString());

        System.out.println("Blue and Large products");
        System.out.println(filter.filter(products, new AndSpecification<Product>(new ColorSpecification(Color.BLUE),
                                                                   new SizeSpecification(Size.LARGE))));
    }

}
