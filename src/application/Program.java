package application;

import services.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        PrintService<String> ps = new PrintService<>();

        System.out.print("Quantos valores vc quer digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        String x = ps.first();
        System.out.println("Primeiro: " + x);

        sc.close();
    }
}
