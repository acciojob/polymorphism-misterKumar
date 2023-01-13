package com.driver;

public class Main {
    public void main(String[]args) {
        Product p = new Product();
        p.product(4, 5);
        p.product(4,5,6);
        p.product(4.5,6.5);
    }
public class Product{
    public int product (int x,int y){
        return x*y;
    }
    public int product(int x, int y, int z) {
        return x*y*z;
    }
    public double product(double x, double y) {
        return x*y;
    }
}
}
