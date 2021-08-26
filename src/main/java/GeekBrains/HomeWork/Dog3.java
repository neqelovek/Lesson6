package GeekBrains.HomeWork;

public class Dog3 extends Animals{

    public Dog3(){
        this("Шарик");
    }

    public Dog3(String name) {
        super("Пёс " + name);
    }
    @Override
    public void swim(int distance) {
        super.swim(5);
    }

    @Override
    public void run(int distance) {
        super.run(500);
    }
}
