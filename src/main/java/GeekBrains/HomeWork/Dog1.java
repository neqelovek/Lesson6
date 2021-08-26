package GeekBrains.HomeWork;

public class Dog1 extends Animals {

    public Dog1(){
        this("Бобик");
    }

    public Dog1(String name) {
        super("Пёс " + name);
    }

    @Override
    public void swim(int distance) {
        super.swim(3);
    }

    @Override
    public void run(int distance) {
        super.run(245);
    }
}

