package GeekBrains.HomeWork;

public class Dog2 extends Animals {

    public Dog2() {
        this("Тузик");
    }

    public Dog2(String name) {
        super("Пёс " + name);
    }

    @Override
    public void swim(int distance) {
        super.swim(8);
    }

    @Override
    public void run(int distance) {
        super.run(339);
    }
}
