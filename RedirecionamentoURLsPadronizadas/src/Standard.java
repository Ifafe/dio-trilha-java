import java.util.Scanner;

public class Standard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lendo a entrada do usuário
        String url = scanner.nextLine();
        
        // TODO: Normalize a URL: removendo espaços e convertendo para minúsculas
        url = url.trim().toLowerCase().replaceAll("\\s+", "");
        
        
        // TODO: Exiba a URL normalizada
        System.out.println(url);
        scanner.close();
    }
}