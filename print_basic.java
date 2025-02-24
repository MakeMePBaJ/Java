

// day 2

public class print_basic {

    public static void main(String[] args) {

        // print a string
        System.out.println();
        System.out.println("This is a Basic Java Program, that prints basic data types");
        System.out.println();


        // primitive data types (p_types)
        int integer_value = 2025;
        double double_value = 2025.0;
        float float_value = 2025.0f;
        String string_value = "2025";
        char char_value = '2'; // only single digits
        boolean is_java_fun = true;

        // non-primitive data types(np_types)

        // print p_types and np_types
        System.out.println(integer_value);
        System.out.println(double_value);
        System.out.println(float_value);
        System.out.println(string_value);
        System.out.println(char_value);
        System.out.println(is_java_fun);


        // example
        int whole_value = 100;
        double percent_value = 0.25;
        double result_value = whole_value * percent_value;

        System.out.printf("Result: %.0f", result_value);

    }
}