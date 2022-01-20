public interface IArithmetic
{
    int operation(int a, int b);
}


public class AirthmeticEx {

	public static void main(String[] args) {
		
		IArithmetic addition = (int a, int b) -> (a + b);
        // Arithmetic addition = (int a, int b) -> {return a + b;};

        System.out.println("Addition = " + addition.operation(5, 6));

       
        IArithmetic subtraction = (int a, int b) -> (a - b);
        // Arithmetic addition = (int a, int b) -> {return a - b;};

        System.out.println("Subtraction = " + subtraction.operation(5, 3));

        
        IArithmetic multiplication = (int a, int b) -> (a * b);
        // Arithmetic addition = (int a, int b) -> {return a * b;};

        System.out.println("Multiplication = " + multiplication.operation(4, 6));

        
        IArithmetic division = (int a, int b) -> (a / b);
        // Arithmetic addition = (int a, int b) -> {return a * b;};

        System.out.println("Division = " + division.operation(12, 6));

    }


	}


