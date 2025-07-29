import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {


        byte opcoesBanco = 0;

        System.out.println("" +
                "Escolha uma opção: \n " +
                "1 - Saldo conta corrente \n " +
                "2 - Ver fatura do cartão \n " +
                "3 - Poupança \n " +
                "4 - Câmbio \n "
        );
        Scanner entradaUsuario = new Scanner(System.in);
        opcoesBanco = entradaUsuario.nextByte();


        switch (opcoesBanco) {

            case 1:
                System.out.println("Saldo conta corrente: 1222,34R$");
                break;

            case 2:
                System.out.println("Fatura do cartão: 222,62R$");
                break;

            case 3:
                System.out.println("Poupança: 5.555,63R$");
                break;

            case 4:
                System.out.println("Câmbio: 1$ = 5,67R$");
                break;

            default:
                System.out.println("Nenhum valor válido selecionado");

        }
    }
}
