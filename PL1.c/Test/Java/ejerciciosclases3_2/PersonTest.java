package ejerciciosclases3_2;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("Carlos", "Calle Luna 123");
        System.out.println(p);
        p.setAddress("Avenida Sol 456");
        System.out.println(p);

        Person.Student s = new Person.Student("Ana", "Residencia", "Ingeniería", 2, 12500);
        System.out.println(s);
        s.setProgram("Matemáticas");
        s.setYear(3);
        s.setFee(13000);
        s.setAddress("Calle Estudio 789");
        System.out.println(s);

        Person.Staff t = new Person.Staff("María", "Calle Trabajo 321", "Facultad Ciencias", 48000);
        System.out.println(t);
        t.setSchool("Facultad Ingeniería");
        t.setPay(51000);
        t.setAddress("Avenida Profesional 987");
        System.out.println(t);
    }
}