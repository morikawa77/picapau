import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        char primeiroReceber, segundoReceber;
        int quantidadeNotas = 0, notaAtual = 0, valorNotaAtual = 0, primeiroValor = 0, segundoValor = 0;

        System.out.println("Qual o primeiro a receber? Se for você digite V, se for seu amigo digite A");
        primeiroReceber = leia.next().charAt(0);

        System.out.println("Qual a quantidade de notas?");
        quantidadeNotas = leia.nextInt();
        
        for(int i = quantidadeNotas; i > 0; i--){
            valorNotaAtual = leia.nextInt();
            if ((quantidadeNotas - 1) % 2 != 0) {
                primeiroValor += valorNotaAtual;
            } else {
                segundoValor += valorNotaAtual;
            }
        }

        

        if(primeiroValor > segundoValor) {
            if (primeiroReceber == 'V') {
                System.out.println("Você recebeu mais que seu amigo");
                System.out.println("Você recebeu " + primeiroValor + " e seu amigo recebeu " + segundoValor + ".");
            } else {
                System.out.println("Seu amigo recebeu mais que você");
                System.out.println("Você recebeu " + segundoValor + " e seu amigo recebeu " + primeiroValor + ".");
            }
            
        } else if(segundoValor > primeiroValor) {
            if (primeiroReceber == 'A') {
                System.out.println("Você recebeu mais que seu amigo");
                System.out.println("Você recebeu " + segundoValor + " e seu amigo recebeu " + primeiroValor + ".");
            } else {
                System.out.println("Seu amigo recebeu mais que você");
                System.out.println("Você recebeu " + primeiroValor + " e seu amigo recebeu " + segundoValor + ".");
            }
        } else {
            System.out.println("Você e seu amigo receberam o mesmo valor");
        }

        

        leia.close();
    }
}
