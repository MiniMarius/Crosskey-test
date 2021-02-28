package crosskeycodetest;
import java.util.Scanner;
import java.io.InputStream;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("prospects.txt");
        Scanner scanner = new Scanner(in);
        ArrayList<Customer> customers = new ArrayList<Customer>();
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String fixedLine = line;

            if (line.equals("")) {
                break;
            }
            if (line.startsWith("\"")) {
                fixedLine = line.replaceAll("\"", "").replaceFirst(",", " ");
            }

            String[] parts = fixedLine.split(",");
            String name = parts[0];
            double loan = Double.parseDouble(parts[1]);
            double interest = Double.parseDouble(parts[2]);
            int years = Integer.parseInt(parts[3]);
            customers.add(new Customer(name, years, loan, interest));
        }
        for (Customer customer: customers) {
            System.out.println(customer);
        }
    }
}