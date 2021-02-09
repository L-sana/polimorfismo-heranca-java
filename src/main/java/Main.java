import java.util.*;
public class Main {
    public static void main(String[] args) {
        int opcao;
        Double imposto, salarioLiquido;
        Scanner entrada = new Scanner(System.in);

        do{
        System.out.println("Escolha o tipo do funcionario à verificar o imposto: ");

        System.out.println(" 1 - Gerente");
        System.out.println(" 2 - Supervisor");
        System.out.println(" 3 - Atendente");
        System.out.println(" 4 - Sair do menu");
        System.out.print("Digite o número referente à opção: ");

        opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    Funcionario gerente = new Gerente(3000.00);
                    salarioLiquido = (gerente.getSalario() - gerente.calculaImposto());
                    System.out.println("--------------------------------------");
                    System.out.printf("Salario Bruto: %.2f\nImposto descontado: %.2f\nSalario Liquido: %.2f\n",gerente.getSalario(), gerente.calculaImposto(), salarioLiquido);
                    System.out.println("--------------------------------------");
                    break;
                case 2:
                    Funcionario supervisor = new Supervisor(2000.00);
                    salarioLiquido = (supervisor.getSalario() - supervisor.calculaImposto());
                    System.out.println("--------------------------------------");
                    System.out.printf("Salario Bruto: %.2f\nImposto descontado: %.2f\nSalario Liquido: %.2f\n",supervisor.getSalario(), supervisor.calculaImposto(), salarioLiquido);
                    System.out.println("--------------------------------------");
                    break;
                case 3:
                    Funcionario atendente = new Atendente(1000.00);
                    salarioLiquido = (atendente.getSalario() - atendente.calculaImposto());
                    System.out.println("--------------------------------------");
                    System.out.printf("Salario Bruto: %.2f\nImposto descontado: %.2f\nSalario Liquido: %.2f\n",atendente.getSalario(), atendente.calculaImposto(), salarioLiquido);
                    System.out.println("--------------------------------------");
                    break;
                case 4:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            }
        }while (opcao > 4 || opcao < 1);
    }
}
