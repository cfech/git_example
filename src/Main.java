public class Main {
    public static void main(String[] args) {

        Labrador lucky = new Labrador("Lucky", "Labrador Retriever", 3, "Yellow");
        Poodle buddy = new Poodle("Buddy", "Standard Poodle", 2, "White");

        lucky.speak();
        lucky.eat("kibble");
        System.out.println(lucky.info());

        buddy.speak();
        buddy.eat("treats");
        System.out.println(buddy.info());
    }
}

