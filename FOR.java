import java.util.Scanner

public class FOR {
    
    public static void main(String[] args) throws Exception {
                // Intervalo de números a ser verificado
                int inicio = 100;
                int fim = 500;
        
                // Percorre todos os números no intervalo
                for (int i = inicio; i <= fim; i++) {
                    // Verifica se o resto da divisão por 11 é 5
                    if (i % 11 == 5) {
                        System.out.println(i);
                    }
                }
            }
        }
    
