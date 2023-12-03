import java.util.Scanner;

public class App4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Quem ganhará a primeira nota? Digite 'V' para você ou 'A' para seu amigo:");
        char primeiroGanhador = scanner.next().charAt(0);

        System.out.println("Quantidade de notas no cofrinho:");
        int quantidadeNotas = scanner.nextInt();

        int[] notas = new int[quantidadeNotas];

        System.out.println("Digite as notas uma por uma:");
        for (int i = 0; i < quantidadeNotas; i++) {
            notas[i] = scanner.nextInt();
        }

        // Processamento
        int totalVoce = 0;
        int totalAmigo = 0;
        char ultimoGanhador = primeiroGanhador;

        for (int i = 0; i < quantidadeNotas; i++) {
            if (ultimoGanhador == 'V') {
                totalVoce += notas[i];
                ultimoGanhador = 'A';
            } else {
                totalAmigo += notas[i];
                ultimoGanhador = 'V';
            }
        }

        // Saída de dados
        System.out.println("Total de dinheiro que você ganhou: " + totalVoce + " reais");
        System.out.println("Total de dinheiro que seu amigo ganhou: " + totalAmigo + " reais");

        // Verificar quem ganhou mais
        if (totalVoce > totalAmigo) {
            System.out.println("Parabéns, você ganhou mais dinheiro!");
        } else if (totalAmigo > totalVoce) {
            System.out.println("Seu amigo ganhou mais dinheiro. Melhor sorte da próxima vez!");
        } else {
            System.out.println("Vocês ganharam a mesma quantidade de dinheiro. Empate!");
        }

        scanner.close();
    }
}
