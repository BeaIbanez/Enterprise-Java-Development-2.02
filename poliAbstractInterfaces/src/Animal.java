public abstract class Animal {
    protected String name;
    protected int age;

    void eat(){
        System.out.println(name + " is eating");
    }

    abstract void makeNoise();

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}