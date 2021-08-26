package GeekBrains.HomeWork;

public class lesson6 {
    public static void main(String[] args) {
        movingAnimals(createdByAnimals());


    }
    static void movingAnimals(Animals[] animals){
        for (Animals animal : animals) {
            animal.swim(30);
            animal.run(30);

        }

    }

    static Animals[] createdByAnimals(){
        return new Animals[] {
                new Cat1(), new Cat2(), new Dog1(), new Dog2(), new Dog3()
        };
    }




}




