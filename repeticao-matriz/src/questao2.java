import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] login = {
            {"Julia@Julia", "Julia123"},
            {"Gael@Gael", "Gael123"},
            {"Maria@Maria", "Maria123"},
            {"Vitor@Vitor", "Vitor123"},
            {"Gigi@Gigi", "Gigi123"},
            {"Akira@Akira", "akira123"}
        };

        while (true) {
            System.out.print("Digite o login: ");
            String email = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            boolean loginCorreto = false;
            boolean usuarioCorreto = false;
            for (String[] usuario : login) {
                if (usuario[0].equals(email)) {
                    usuarioCorreto = true;
                    if (usuario[1].equals(senha)) {
                        System.out.println("Seu login está correto.");
                        loginCorreto = true;
                        break;
                    }
                }
            }

            if (!loginCorreto) {
                if (usuarioCorreto) {
                    System.out.println("Seu login está correto, mas a senha está errada! Por favor, tente novamente.");
                } else {
                    System.out.println("Seu login está errado! Por favor, tente novamente.");
                }
            } else {
                break;
            }
        }
    }
}


            

