import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Digite o limite do cartão:");
        double limit = read.nextDouble();

        CreditCard card = new CreditCard(limit);

        int leave = 1;
        while (leave !=0){
            System.out.println("Digite a descrição da compra:");
            String description = read.next();

            System.out.println("Digite o valor da compra:");
            double value = read.nextDouble();

            Shopping shopping = new Shopping(description, value);
            boolean shoppingDone = card.throwShopping(shopping);

            if(shoppingDone) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Digite 0 para sair ou 1 para continuar:");
                leave = read.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                System.out.println("Digite 0 para sair ou 1 para continuar:");
                leave = read.nextInt();
            }

        }

        System.out.println("************************");
        System.out.println("Compras realizadas:\n");
        Collections.sort(card.getShopping());

        for (Shopping shopping : card.getShopping()) {
            System.out.println(shopping.getDescription() + " - " + shopping.getValue());
        }
        System.out.println("************************");
        System.out.println("\nSaldo do cartão: " + card.getBalance());
    }


}
