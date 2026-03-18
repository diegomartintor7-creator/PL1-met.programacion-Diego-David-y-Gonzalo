package ejercicio6_6;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private String captureOutput(Runnable action) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        try {
            action.run();
        } finally {
            System.setOut(original);
        }
        return out.toString().trim();
    }

    // ─────────────────────────────────────────────
    // Cat
    // ─────────────────────────────────────────────

    @Test
    void catGreets() {
        Cat cat = new Cat("Misu");
        assertEquals("Meow", captureOutput(cat::greets));
    }

    @Test
    void catPolymorphismAsAnimal() {
        Animal a = new Cat("Misu");
        assertEquals("Meow", captureOutput(a::greets));
    }

    // ─────────────────────────────────────────────
    // Dog
    // ─────────────────────────────────────────────

    @Test
    void dogGreets() {
        Dog dog = new Dog("Rex");
        assertEquals("Woof", captureOutput(dog::greets));
    }

    @Test
    void dogGreetsAnotherDog() {
        Dog d1 = new Dog("Rex");
        Dog d2 = new Dog("Max");
        assertEquals("Woooof", captureOutput(() -> d1.greets(d2)));
    }

    @Test
    void dogPolymorphismAsAnimal() {
        Animal a = new Dog("Rex");
        assertEquals("Woof", captureOutput(a::greets));
    }

    // ─────────────────────────────────────────────
    // BigDog
    // ─────────────────────────────────────────────

    @Test
    void bigDogGreets() {
        BigDog bd = new BigDog("Thor");
        assertEquals("Wooow", captureOutput(bd::greets));
    }

    @Test
    void bigDogGreetsAnotherDog() {
        BigDog bd = new BigDog("Thor");
        Dog d = new Dog("Rex");
        assertEquals("Woooooow", captureOutput(() -> bd.greets(d)));
    }

    @Test
    void bigDogGreetsAnotherBigDog() {
        BigDog bd1 = new BigDog("Thor");
        BigDog bd2 = new BigDog("Zeus");
        assertEquals("Wooooooooow", captureOutput(() -> bd1.greets(bd2)));
    }

    @Test
    void bigDogPolymorphismAsAnimal() {
        Animal a = new BigDog("Thor");
        assertEquals("Wooow", captureOutput(a::greets));
    }

    @Test
    void bigDogDowncastFromAnimal() {
        Animal a = new BigDog("Thor");
        Dog d = (Dog) a;
        BigDog bd = (BigDog) a;

        // d2 es también BigDog, así que greets(Dog) en BigDog se resuelve como Woooooow
        assertEquals("Woooooow", captureOutput(() -> bd.greets(d)));
        assertEquals("Wooooooooow", captureOutput(() -> bd.greets(bd)));
    }

    @Test
    void dogDowncastGreetsBigDogAsDog() {
        Animal a2 = new Dog("Rex");
        Animal a3 = new BigDog("Thor");
        Dog d1 = (Dog) a2;
        Dog d2 = (Dog) a3;

        // d1 es Dog real → greets(Dog) de Dog
        assertEquals("Woooof", captureOutput(() -> d1.greets(d2)));
        // d2 es BigDog real → greets(Dog) de BigDog (override)
        assertEquals("Woooooow", captureOutput(() -> d2.greets(d1)));
    }
}