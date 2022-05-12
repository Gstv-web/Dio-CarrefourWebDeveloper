package Java;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/* Crie uma aplicação que resolva as seguintes situações:

- Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados;
- A partir da hora do dia, informe a mensagem adequada: “Boa tarde”, “Bom dia”, “Boa noite”;
- Calcule o valor final de um empréstimo a partir do valor solicitado. Taxas e parcelas influenciam.
Defina arbitrariamente as faixas que influenciam nos valores.
*/

public class Ex1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        


        System.out.println("Operações matemáticas" + "\n");
        soma(a, b);
        subtração(a, b);
        multiplicação(a, b);
        divisão(a, b);
        // primeira etapa ok

        System.out.println("\n");
        System.out.println("Mensagem de boas-vindas conforme horário" + "\n");
        mensagemHoras();
        // segunda etapa ok


        System.out.println("\n");
        System.out.println("Valor final de um empréstimo" + "\n");
        calcularEmpréstimo();
        // terceira etapa ok

    }

    public static void soma(int a, int b) {
        System.out.println("Soma de " + a + " + " + b + " = " + a + b);
    }

    public static void subtração(int a, int b) {
        System.out.println("Subtração de " + a + " - " + b + " = " + (a - b));
    }

    public static void multiplicação(int a, int b) {
        System.out.println("Multiplicação de " + a + " x " + b + " = " + (a * b));
    }

    public static void divisão(int a, int b) {
        System.out.println("Divisão de " + a + " / " + b + " = " + (a / b));
    }


    public static void mensagemHoras() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss"); // formato da hora
        LocalDateTime now = LocalDateTime.now(); // pega o horário atual
        if (now.getHour() >= 4 && now.getHour() < 12) {
            System.out.println("Bom dia! São " + dtf.format(now));
        } else if (now.getHour() > 12 && now.getHour() < 18) {
            System.out.println("Boa tarde! São " + dtf.format(now));
        } else {
            System.out.println("Boa noite! São " + dtf.format(now));
        }
    }

    public static void calcularEmpréstimo() {
        final DecimalFormat df = new DecimalFormat("0.00"); // para formatar o valor final em dinheiro, com duas casas decimais
        double valor = 1000;
        double taxa6meses = 0.5;
        double taxa12meses = 0.99;

        System.out.println("Valor do empréstimo: R$ " + df.format(valor));
        double valor3meses = valor;
        System.out.println("Valor do empréstimo em 3 meses sem taxa: R$ " + df.format(valor3meses));
        double valor6meses = valor * taxa6meses;
        System.out.println("Valor do empréstimo em 6 meses com taxa de 0.5%: R$ " + df.format((valor + valor6meses)));
        double valor12meses = valor * taxa12meses;
        System.out.println("Valor do empréstimo em 12 meses com taxa de 0.99%: R$ " + df.format((valor + valor12meses)));
    }
}