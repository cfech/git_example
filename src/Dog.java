abstract class Dog {
    private String name;
    private String breed;
    private int age;
    private String color;

    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public abstract void speak();

    public abstract void eat(String food);

    public String getName() {
        return name;
    }

    public String info() {
        return name + " is a " + age + "-year-old " + color + " " + breed + ".";
    }

}





