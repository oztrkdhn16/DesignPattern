package CreationalDP.SingletonDP;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        // SingletonObject obj1 = new SingletonObject(); // HATA
        SingletonObject obj2 = SingletonObject.getInstance();
        System.out.println(obj2.message); // MERHABA
        obj2.changeMessage();


        SingletonObject obj3 = SingletonObject.getInstance();
        System.out.println("obj3 için : " + obj3.message); // --> message = "MERHABA BATCH 104-105-114"



    }
}
