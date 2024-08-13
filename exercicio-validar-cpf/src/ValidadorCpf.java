import java.util.Scanner;

public class ValidadorCpf {

    // Função principal para validar o CPF
    public static boolean validarCpf(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("\\D", "");

        // Verifica se o CPF tem exatamente 11 dígitos
        if (cpf.length() != 11) {
            System.out.println("CPF inválido: deve conter 11 dígitos numéricos.");
            return false;
        }

        // Verifica se o CPF é um número repetido (exemplo: 111.111.111-11)
        if (isCpfRepetido(cpf)) {
            System.out.println("CPF inválido: números repetidos.");
            return false;
        }

        // Valida o CPF
        return isCpfValido(cpf);
    }

    // Função para verificar se o CPF é composto por dígitos repetidos
    private static boolean isCpfRepetido(String cpf) {
        char primeiroDigito = cpf.charAt(0);
        for (int i = 1; i < cpf.length(); i++) {
            if (cpf.charAt(i) != primeiroDigito) {
                return false; // Encontrou um dígito diferente
            }
        }
        return true; // Todos os dígitos são iguais
    }

    // Função para validar o CPF
    private static boolean isCpfValido(String cpf) {
        int primeiroDigito = calcularDigito(cpf, 10);
        int segundoDigito = calcularDigito(cpf, 11);
        return cpf.equals(cpf.substring(0, 9) + primeiroDigito + segundoDigito);
    }

    // Função para calcular um dos dígitos verificadores
    private static int calcularDigito(String cpf, int peso) {
        int soma = 0;
        for (int i = 0; i < cpf.length() - 2; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * peso--;
        }
        int resto = soma % 11;
        return resto < 2 ? 0 : 11 - resto;
    }
}
