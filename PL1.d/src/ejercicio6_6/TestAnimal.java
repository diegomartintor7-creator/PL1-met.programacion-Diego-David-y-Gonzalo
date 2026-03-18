package ejercicio6_6;

public class TestAnimal {

    public static void main(String[] args) {

        Animal a1 = new Cat("Misu");
        Animal a2 = new Dog("Rex");
        Animal a3 = new BigDog("Thor");

        a1.greets();
        a2.greets();
        a3.greets();

        Dog d1 = (Dog) a2;
        Dog d2 = (Dog) a3;
        BigDog bd1 = (BigDog) a3;

        d1.greets(d2);
        d2.greets(d1);
        bd1.greets(d2);
        bd1.greets(bd1);

        // No se puede llamar a greets() específico desde Animal porque la clase Animal
        // solo define el metodo abstracto sin las sobrecargas por parametros
    }
}