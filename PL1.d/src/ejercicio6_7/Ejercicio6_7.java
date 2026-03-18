package ejercicio6_7;

public class Ejercicio6_7 {

    /*
    =========================
    DIAGRAMA UML (DESCRIPCIÓN)
    =========================

    Animal (abstract)
    -----------------
    + greeting() : void (abstract)

            ▲
            |
    -------------------------
    |                       |
    Cat                     Dog
    ---                     ---
    + greeting()            + greeting()
                            + greeting(Dog)

                                    ▲
                                    |
                                 BigDog
                                 ------
                                 + greeting()
                                 + greeting(Dog)


    =========================
    EXPLICACIÓN DE SALIDAS
    =========================

    Cat cat1 = new Cat();
    cat1.greeting();
    → Meow!

    Dog dog1 = new Dog();
    dog1.greeting();
    → Woof!

    BigDog bigDog1 = new BigDog();
    bigDog1.greeting();
    → Woow!


    // POLIMORFISMO

    Animal animal1 = new Cat();
    animal1.greeting();
    → Meow!
    (Se ejecuta el metodo de Cat porque el objeto real es Cat)

    Animal animal2 = new Dog();
    animal2.greeting();
    → Woof!

    Animal animal3 = new BigDog();
    animal3.greeting();
    → Woow!

    Animal animal4 = new Animal();
    → ERROR de compilación porque Animal es abstracta y no se puede instanciar.


    // DOWNCAST

    Dog dog2 = (Dog) animal2;     // correcto (animal2 es Dog)
    BigDog bigDog2 = (BigDog) animal3; // correcto (animal3 es BigDog)
    Dog dog3 = (Dog) animal3;     // correcto (BigDog ES un Dog)

    Cat cat2 = (Cat) animal2;
    → ERROR en ejecución (ClassCastException) porque animal2 es Dog, no Cat.


    dog2.greeting(dog3);
    → Woooooooooof!
    (metodo greeting(Dog) de Dog)

    dog3.greeting(dog2);
    → Woooooowwwww!
    (dog3 realmente es BigDog → usa override)

    dog2.greeting(bigDog2);
    → Woooooooooof!
    (tipo del objeto que ejecuta = Dog)

    bigDog2.greeting(dog2);
    → Woooooowwwww!

    bigDog2.greeting(bigDog1);
    → Woooooowwwww!
    (BigDog no sobrecarga con BigDog, usa greeting(Dog))
    */
}