public class Cat extends Animal{


    @Override
    void makeNoise() {
        System.out.println("Meow");
    }

    public Cat(String name, int age) {
        super(name, age);

    }




}