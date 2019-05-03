

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your message here and confirm with ENTER:");
        String text = scanner.nextLine();
        System.out.println("Input the length of a sms:");
        int smsLength = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input the price of a sms:");
        String unitPrice = scanner.nextLine();
        System.out.println("Choose a method of compression (n = naive method; o = optimal method):");
        String typeOfCompressor = scanner.nextLine();

        Paginator paginator = new Paginator(smsLength);
        CostCalculator calculator = new CostCalculator(new BigDecimal(unitPrice));
        Compresor compressor;
        switch (typeOfCompressor){
            case "n": compressor = new NaiveCompresor();
                break;
         //  case "o": compressor = new OptimalCompresor();
               // break;
            default: throw new IllegalArgumentException();
        }

        String compressedMessage = compressor.compress(text);
        String[] paginatedMessage = paginator.paginate(compressedMessage);
        System.out.println("Your codded and splited message: " + Arrays.toString(paginatedMessage));
        System.out.println("Cost of your message(s): " + calculator.calculate(paginatedMessage.length));
    }
}