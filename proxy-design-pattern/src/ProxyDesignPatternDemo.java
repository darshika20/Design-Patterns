/**
 * In Proxy design pattern , a proxy object is used so that the real object is not created multiple times of the same
 * type , like here, a proxy object is created ,and it initializes a real object only once and then is reused
 * */

public class ProxyDesignPatternDemo {

    public static void main(String[] args){
        Image image = new ProxyImage("abc.txt");
        // new image will be created
        image.draw();
        //same image will be reused
        image.draw();
    }
}
