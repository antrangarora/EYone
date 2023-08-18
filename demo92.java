import java.util.Scanner;

public class demo92{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number ");
        String Number = scanner.nextLine();
        
        if (isValidPhoneNumber(Number)) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
        
        scanner.close();
    }
    
    public static boolean isValidPhoneNumber(String Number) {
        if (Number.length() != 10) {
            return false;
        }
        
        char first = Number.charAt(0);
        if (first != '9' && first!= '8' && first!= '7') {
            return false;
        }
        
        for (char digit :Number.toCharArray()) {
            if (!Character.isDigit(digit)) {
                return false;
            }
        }
        
        return true;
    }
}
