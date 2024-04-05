package exercicio;

public class Exercicio5 {
    public static void main(String[] args) {
        String original = "invertido";
        String reversed1 = reverseStringRecursivo(original);
        String reversed2 = reverseStringIterativo(original);
        System.out.println("Original: " + original);
        System.out.println("Invertida: " + reversed1);
        System.out.println("Invertida: " + reversed2);
    }

    public static String reverseStringRecursivo(String str) {
        // Caso base: se a string for vazia ou tiver comprimento 1, ela já está invertida
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        // Chamada recursiva: inverte a substring excluindo o primeiro caractere
        // e depois concatena o primeiro caractere
        return reverseStringRecursivo(str.substring(1)) + str.charAt(0);
    }
    public static String reverseStringIterativo(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            // Troca os caracteres nas posições start e end
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move os índices para o próximo par de caracteres
            start++;
            end--;
        }

        // Converte o array de caracteres de volta para uma string
        return new String(charArray);
    }
}
