package GeekBrains.HomeWork;

public class Cat2 extends Animals{

    public Cat2(){
        this("Васька");
    }


    public Cat2(String name) {
        super("Koт " + name);
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать");

        }

    @Override
    public void run(int distance) {
        super.run(100);
    }
}

