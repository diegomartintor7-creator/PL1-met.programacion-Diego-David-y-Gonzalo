package ejerciciosclases3_6;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("Animal genérico");
        System.out.println(a);

        Animal.Mammal m = new Animal.Mammal("Mamífero genérico");
        System.out.println(m);

        Animal.Mammal.Cat c = new Animal.Mammal.Cat("Bigotes");
        System.out.println(c);
        c.greets();

        Animal.Mammal.Dog d = new Animal.Mammal.Dog("Rex");
        System.out.println(d);
        d.greets();
        d.greets(new Animal.Mammal.Dog("Max"));
    }
}