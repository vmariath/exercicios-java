import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("----- Validador de CPF -----");
            System.out.print("Digite um CPF para validar: ");
            String cpf = scanner.nextLine();

            // Valida o CPF e exibe o resultado
            boolean resultado = ValidadorCpf.validarCpf(cpf);
            if (resultado) {
                System.out.println("CPF válido.");
            } else {
                System.out.println("CPF inválido.");
            }

            // Pergunta se o usuário deseja validar outro CPF
            System.out.print("Deseja validar outro CPF? (s/n): ");
            String resposta = scanner.nextLine().trim().toLowerCase();
            if (!resposta.equals("s")) {
                continuar = false;
                System.out.println("Encerrando o programa.");
            }
        }

        scanner.close();
    }
    }
