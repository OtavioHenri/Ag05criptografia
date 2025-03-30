import javax.swing.JOptionPane;  

public class App {  
    public static void main(String[] args) {  
        // Entrada de dados  
        String entrada = JOptionPane.showInputDialog("Digite a String para criptografar:");  
        
        // Verifica se a entrada não é nula  
        if (entrada != null) {  
            // Converte a String para um vetor de caracteres  
            char[] caracteres = entrada.toCharArray();  
            // Cria um vetor de inteiros para armazenar os códigos ASCII  
            int[] ascii = new int[caracteres.length];  

            // Converte os caracteres para ASCII e realiza a criptografia  
            for (int i = 0; i < caracteres.length; i++) {  
                ascii[i] = (int) caracteres[i] + 10; // Soma 10 ao valor ASCII  
            }  

            // Converte os códigos ASCII de volta para caracteres e monta a String criptografada  
            StringBuilder saida = new StringBuilder();  
            for (int valor : ascii) {  
                saida.append((char) valor);  
            }  

            // Exibe a String criptografada  
            JOptionPane.showMessageDialog(null, "String criptografada: " + saida.toString());  
        } else {  
            JOptionPane.showMessageDialog(null, "Entrada cancelada.");  
        }  
    }  
}  