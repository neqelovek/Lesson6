package GeekBrains.HomeWork;

public class Cat1 extends Animals{

    public Cat1(){
        this("Барсик");
    }


    public Cat1(String name) {
        super("Koт " + name);
    }

    @Override
    public void swim(int distance) {
            System.out.println("Кот " + getName() + " не умеет плавать");
    }

    @Override
    public void run(int distance) {
        super.run(200);
    }
}
