public class classA {
    int x = 0;

    void f(){
        int y = 20;
        x = 10;
        System.out.println(y);
    }

    void print(){
        int y = 0;
        System.out.println(x);
        f();
        System.out.println(x);
        System.out.println(y);
    }

}
