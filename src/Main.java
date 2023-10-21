public class Main {
    public static void main(String[] args) {

        Labrador buddy = new Labrador("Buddy", "Labrador Retriever", 3, "Yellow");
        Poodle lucky = new Poodle("Lucky", "Standard Poodle", 2, "White");

        buddy.speak();
        buddy.eat("kibble");
        System.out.println(buddy.info());

        lucky.speak();
        lucky.eat("treats");
        System.out.println(lucky.info());
    }
}

