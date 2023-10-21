public class Main {
    public static void main(String[] args) {

        Labrador labrador = new Labrador("Buddy", "Labrador Retriever", 3, "Yellow");
        Poodle lucky = new Poodle("Lucky", "Standard Poodle", 2, "White");

        labrador.speak();
        labrador.eat("kibble");
        System.out.println(labrador.info());

        lucky.speak();
        lucky.eat("treats");
        System.out.println(lucky.info());
    }
}

