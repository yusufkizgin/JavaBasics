public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        ProductManager  productManager = new ProductManager();
        product.name = "Laptop";
        product.price = 5000;
        product.id = 01;
        product.stockAmount = 19;
        product.description = "Bu ürün bir bilgisayardır";
        productManager.Add(product);
        System.out.println(product.name);
    }
}