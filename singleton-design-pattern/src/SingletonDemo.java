public class SingletonDemo {

    public static void main(String[] args){
        Singleton obj = Singleton.getInstance();

        //Singleton obj1 = new Singleton();

        obj.show();
    }
}
