import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine();
        int year = scanner.nextInt();
        String pref = scanner.next();
        
        System.out.println("The form for " + name 
            + " is completed. We will contact you if we need a chef who cooks " + 
            pref + " dishes and has " + year + " years of experience.");
    }
}
