import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Cálculo de horas MEI");
        Scanner teclado = new Scanner(System.in);

        // Entradas
        // Pedir o nome do analista
        System.out.println(" Digite o nome do Analista: ");
        String nomeAnalista = teclado.nextLine();
        // Pedir o salário pretendido
        System.out.println("Digite o valor de salário pretendido");
        double salarioPretendido = teclado.nextDouble();

        teclado.close();
       
        // Processamento
        double salarioHora = (salarioPretendido * 2) / (7*20);  // salario pretendido dividido pela quantidade de hora trabalhada
       
        // Sáida 
        System.out.printf("O analista %s  Deverá cobrar %.2f por hora", nomeAnalista, salarioHora);
        
    }
}
