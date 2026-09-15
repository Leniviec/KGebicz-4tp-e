import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String imie = sc.nextLine().trim();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = sc.nextLine().trim();

        System.out.print("Podaj email: ");
        String email = sc.nextLine().trim();

        System.out.print("Podaj haslo: ");
        String haslo = sc.nextLine().trim();

        if(imie.isEmpty() || nazwisko.isEmpty() || email.isEmpty() || haslo.isEmpty()){
            System.out.println("Uzupełnij wszystkie pola!!!");
            System.exit(0);
        };
        boolean zawiera;
        if (email.contains("@") && email.contains(".")) {
            zawiera = true;
        } else {
            System.out.println("Podaj poprawny adres email!!");
            System.exit(0);
        };

        if (haslo.length() < 8
                || !haslo.matches(".*[A-Z].*")
                || !haslo.matches(".*[a-z].*")
                || !haslo.matches(".*[!@#$%^&*()_+{}?;':<>,./\\-=].*")) {

            System.out.println("Hasło musi mieć co najmniej 8 znaków, dużą i małą literę oraz znak specjalny!!!");
            System.exit(0);
        }
        System.out.println("Dane są prawidłowe");
        System.exit(0);
    };
};