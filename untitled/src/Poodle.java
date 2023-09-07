class Poodle extends Dog {
    public Poodle(String name, String breed, int age, String color) {
        super(name, breed, age, color);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says Bark!");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " enjoys eating " + food + ".");
    }
}