import java.util.Scanner;

public class SistemaCompras {
    public static void main(String[] args) {
        Object[] product_list = get_products();
        String[] product_names = (String[]) product_list[0];
        double[] product_prices = (double[]) product_list[1];
        
        System.out.println("Bem vindo à loja do Roblox !\nVeja nossos produtos: ");
        System.out.println("Estamos com uma promoção !!! Gaste acima de R$50 e receba 25% de desconto na sua compra !!!");
        for (int i = 0; i < product_names.length; i++) {
            System.out.println((i + 1) + "-> " + product_names[i] + " | Preço: " + product_prices[i]);
        }

        // Criar um carrinho zerado (um zero para cada posição de produto)
        Scanner input = new Scanner(System.in);

        int[] cart = new int[product_names.length];
        for (int i = 0; i < product_names.length; i++) {
            cart[i] = 0;
        }
        
        boolean stop_buying = false;
        while (stop_buying == false) {
            int choice = -1;
            
            System.out.println("Para comprar um produto digite o número dele (digite 0 para parar de comprar): ");
            while (choice != 0) {
                choice = input.nextInt();

                if (choice == 0) {
                    break;
                }

                if (choice > product_names.length) {
                    System.out.println("O produto selecionado está fora do catálogo");
                    continue;
                }
    
                // Adicionar uma unidade deste produto no carrinho
                cart[choice - 1] += 1;
                System.out.println(product_names[choice - 1] + " adicionado ao carrinho");
            }
            
            System.out.println("Você tem certeza que quer parar de comprar? ");
            System.out.println("Seu carrinho: ");
            double cart_price = 0;
            for (int i = 0; i < product_names.length; i++) {
                if (cart[i] == 0) {
                    continue;
                }

                cart_price += product_prices[i] * cart[i];
                System.out.println(product_names[i] + "\t | Preço: " + product_prices[i] + "\t | Quantidade: " + cart[i] + "\t | Total: " + (cart[i] * product_prices[i]));   
            }
            System.out.println("Valor total: " + cart_price);

            int stop = -1;
            System.out.println("Você deseja parar de comprar?\n1->Sim\n0->Não");
            while (true) {
                stop = input.nextInt();
                if (stop == 1 || stop == 0) {
                    break;
                }
                System.out.println("Use 1 para Sim ou 0 para Não: ");
            }
            stop_buying = stop == 1;
        }

        double total_price = 0;
        // Somar todos os produtos multiplicando pelas quantidades no carrinho
        for (int i = 0; i < product_names.length; i++) {
            total_price += product_prices[i] * cart[i];
        }

        System.out.println("O preço total do seu carrinho foi " + total_price);

        double discount = 0.0;
        if (total_price >= 50.0) {
            discount = 0.25;
            System.out.println("Por ter gasto mais que R$50.0, você tem um desconto de " + discount * 100 + "% !");
        }

        total_price = total_price - (total_price * discount);
        System.out.println("Com desconto de " + discount * 100 + "% " + " o valor final do seu carrinho será: " + total_price);
        System.out.println("Agradecemos sua compra !");

        input.close();
    }  

    public static Object[] get_products() {
        String[] products = {"Bloxy Cola", "Taco", "Robux"};
        double[] prices = {5.75, 10.99, 3.90};

        return new Object[]{products, prices};
    }
}