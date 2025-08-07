package structural.proxy;
 // Client class
public class ProxyDemo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");
        image1.display();
        System.out.println("------");
        image1.display(); // already loaded, will not load again

        System.out.println("------");
        image2.display();
    }
}