import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        
        System.out.println("Olá, como vai? Por gentileza, digite o número da sua conta:");
        int numeroconta = scanner.nextInt();

        System.out.println("Digite o número da sua agência:");
        String numeroagencia = scanner.next();
    
        System.out.print("Ótimo! Agora digite seu nome e sobrenome:");
        scanner.nextLine(); //eu não estava conseguindo inserir espaço no nome, então achei essa solução no Stack Overflow.
        String nomesobrenome = scanner.nextLine();

        System.out.print("Para finalizar, preciso que digite seu saldo bancário:");
        double saldo = scanner.nextDouble();

        System.out.print("Olá "+nomesobrenome+", obrigado por criar uma conta em nosso banco, sua agência é a de nº"+numeroagencia+", sua conta é "+numeroconta+" e seu saldo de R$"+saldo+" já está disponível para saque.");
    
    }
}
