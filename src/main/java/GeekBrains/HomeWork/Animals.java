package GeekBrains.HomeWork;


public abstract class Animals {

    private final String name;


    public Animals(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void swim(int distance) {
        System.out.println(getName() +" Проплыл " + distance + 'm');

    }
    public void run(int distance) {
        System.out.println(getName() +" Пробежал " + distance + 'm');

    }
}
