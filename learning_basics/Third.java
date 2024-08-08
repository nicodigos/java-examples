public class Third {
    public static void main(String[] args) {
        Person fulano = new Person();
        Employee empleado = new Employee();
        Student estudiante = new Student();
        fulano.display();
        empleado.display();
        estudiante.display();
    }
}

class Person {
    String name;
    int age;
    double[] location; 

    public Person() {
        double[] location = {10.47679, -66.80786};
        this.name = "Pepito";
        this.age = 25;
        this.location = location;
    }

    public void display() {
        System.err.println(name + " " +
                        age + " " +
                        location + " " 
        );
    }
}

class Employee extends Person {
    String employment;

    public Employee() {
        this.employment = "soldado";
    }

    public void display() {
        super.display();
        System.err.println(employment);
    }
}

class Student extends Employee {
    @Override
    public void display() {
        System.err.println("Im a student");
    }
}