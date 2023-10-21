class Labrador extends Dog {
    public Labrador(String name, String breed, int age, String color) {
        super(name, breed, age, color);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says Woof!");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " eats " + food + ".");
    }
}