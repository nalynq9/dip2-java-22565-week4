public class IfElseStatement {
    public static void testIf() {
        String language = "Java";
        if (language == "Java") {
            System.out.println("Java Programming");
        }
    }

    public static void testIfElse() {
        String language = "Java";
        if (language == "Java") {
            System.out.println("Java Programming");
        }
    }

    public static void testIfElse2() {
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        if (number < 0) {
            System.out.println("Statement outside if..else block");
        }
    }

    public static void testIfElseIfElse() {
        String day = "Monday";

        if (day == "Sunday") {
            System.out.println("Sunday");
        } else if (day == "Monday") {
            System.out.println("Monday");
        } else {
            System.out.println("ERROR Day");
        }
    }

    public static void nestedIfElse() {
        int age = 25;
        int weigh = 48;

        if (age >= 18) {
            if (weigh > 50) {
                System.out.println("You are eligible to Donate a blood");
            }
            } else {
                System.out.println("Age must be greater han 18");
            }
        }
    }


