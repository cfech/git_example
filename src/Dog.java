abstract class Dog {
    private String name;
    private String breed;
    private int loyalty;
    private String color;

    public Dog(String name, String breed, int loyalty, String color) {
        this.name = name;
        this.breed = breed;
        this.loyalty = loyalty;
        this.color = color;
    }

    public abstract void speak();

    public abstract void eat(String food);

    public String getName() {
        return name;
    }

    public String info() {
        return name + " is a " + loyalty + "-year-old " + color + " " + breed + ".";
    }

}





