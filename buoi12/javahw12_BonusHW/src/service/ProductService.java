package service;

import model.Product;

import java.util.ArrayList;

public class ProductService {
    public ArrayList<Product> getAllProduct(){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1,"Iphone 13 promax","Iphone",30000000,50,26,"Apple",new String[]{"Điện thoại","Apple"}));
        products.add(new Product(5,"Macbook air m1","Laptop",25000000,30,15,"Apple",new String[]{"Laptop","Apple"}));
        products.add(new Product(2,"Iphone 13 mini","Iphone",20000000,16,5,"Apple",new String[]{"Điện thoại","Apple"}));
        products.add(new Product(7,"Sạc nhanh magsafe","Sạc",1000000,80,36,"Apple",new String[]{"Phụ kiện","Apple"}));
        products.add(new Product(6,"Iphone 13","Iphone",22000000,20,6,"Apple",new String[]{"Điện thoại","Apple"}));
        products.add(new Product(8,"Samsung galaxy Z fold3","Samsung",42000000,50,20,"Samsung",new String[]{"Điện thoại","Samsung"}));
        products.add(new Product(9,"Samsung galaxy Z flip3","Samsung",25000000,25,6,"Samsung",new String[]{"Điện thoại","Samsung"}));
        products.add(new Product(3,"Xiaomi 11T Pro","Xiaomi",16000000,20,6,"Xiaomi",new String[]{"Điện thoại","Xiaomi"}));
        return products;
    }

    public static void show(ArrayList<Product> products){
        for (Product p:products){
            System.out.println(p);
        }
    }

}
