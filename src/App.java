import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        char primeiroReceber, segundoReceber = 'V';
        int quantidadeNotas, notaAtual = 0, valorNotaAtual = 0, valorFinalVoce = 0, valorFinalAmigo = 0;

        System.out.println("Qual o primeiro a receber? Se for você digite V, se for seu amigo digite A");
        primeiroReceber = leia.next().charAt(0);

        System.out.println("Qual a quantidade de notas?");
        quantidadeNotas = leia.nextInt();
        
        // if (primeiroReceber == 'V'){
        //     segundoReceber = 'A';
        // } else {
        //     segundoReceber = 'V';
        // }

        if (segundoReceber == 'V'){
            primeiroReceber = 'A';
        } else {
            segundoReceber = 'V';
        }

        switch (primeiroReceber) {
            case 'V':
                for(int i = quantidadeNotas; i > 0; i--){
                    System.out.println("Digite o valor da nota:");
                    valorNotaAtual = leia.nextInt();
                    if ((quantidadeNotas - 1) % 2 == 0) {
                        // valorFinalAmigo += valorNotaAtual;
                        valorFinalAmigo = valorFinalAmigo + valorNotaAtual;
                    } else {
                        // valorFinalVoce += valorNotaAtual;
                        valorFinalVoce = valorFinalVoce + valorNotaAtual;
                    }
                }
                break;
            case 'A':
                for(int i = quantidadeNotas; i > 0; i--){
                    System.out.println("Digite o valor da nota:");
                    valorNotaAtual = leia.nextInt();
                    if ((quantidadeNotas - 1) % 2 == 0) {
                        // valorFinalVoce += valorNotaAtual;
                        valorFinalVoce = valorFinalVoce + valorNotaAtual;
                    } else {
                        // valorFinalAmigo += valorNotaAtual;
                        valorFinalAmigo = valorFinalAmigo + valorNotaAtual;
                    }
                }
                break;   
        
            default:
                break;
        }

        if(valorFinalAmigo > valorFinalVoce) {
            System.out.println("Seu amigo recebeu mais que você");
        } else if(valorFinalVoce > valorFinalAmigo) {
            System.out.println("Você recebeu mais que seu amigo");
        } else {
            System.out.println("Você e seu amigo receberam o mesmo valor");
        }

        System.out.println("Você recebeu " + valorFinalVoce + " e seu amigo recebeu " + valorFinalAmigo + ".");

        leia.close();
    }
}
