public class First {
    public static void main(String [] args) {
        
        int numero = 1;
        System.err.println(numero);
        char caracter = '2';
        System.err.println(caracter);
        boolean booleano = false;
        System.err.println(booleano);
        double decimal = 9.3232231231;
        System.err.println(decimal);
        float decimal_short = 9.1f;
        System.err.println(decimal_short);
        long num_largo = 123121312323123123L;
        System.err.println(num_largo);
        short num_short = 1123;
        System.err.println(num_short);
        byte bite = 0;
        System.err.println(bite);
        
        // Arrays
        int[] numeros_arr = new int[5];
        // This output doesnt make sense, you need a for        
        System.err.println(numeros_arr);

        int suma = 1 + 3 - 2 * 8;
        System.err.println(suma);
        float div = suma / 2;
        System.err.println(div);
        int module = suma % 2;
        System.err.println(module);


        boolean operator = 1 == 2;
        boolean operator2 = 5 >= 3;
        boolean operator3 = operator && operator2;
        boolean operator4 = operator || operator2;
        boolean negation = !operator;
        System.err.println(operator3);
        System.err.println(operator4);
        System.err.println(negation);

        // if else

        float votes = 0.3F;

        if (votes > 0.5) {
            System.err.println("You are the new president!");
        } else {
            System.err.println("Fuck off, dictator!");
        }

        byte weekday = 6;
        switch (weekday) {
            case 0:
                System.err.println("Monday");
                break;
            case 2:
                System.err.println("Wednesday");
                break;
            case 3:
                System.err.println("Thursday");
                break;
            case 4:
                System.err.println("Friday");
                break;
            case 5:
                System.err.println("Saturday");
                break;
            case 6:
                System.err.println("Sunday");
                break;
            case 1:
                System.err.println("Tuesday");
                break;            
        
            default:
                System.err.println("This is not a weekday!");
                break;
        }

        // For

        for (int i = 0; i < 16; i++) {
            System.err.println("Agregando una cerveza");
        }

        int counter = 0;
        while (counter <= 10) {
            System.err.println(counter);
            counter++;
        }

        counter = 100;
        do {
            System.err.println(counter);    
        } while (counter <= 10);

        System.err.println(Greeting("Nicolas"));
        System.err.println(Greeting(5));



    }


    public static String Greeting(String name) {
        return "Hello, " + name;
    }

    public static String Greeting(int a)  {
        String resultString = "";
        for(int i = 0; i <= a; i++) {
            resultString += "Hello World ";
        }

        return resultString;
    }
}