import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do atleta:");
        String nome = scanner.nextLine();

        System.out.println("Digite o gênero do atleta:");
        String genero = scanner.nextLine();

        System.out.println("Digite a idade do atleta:");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Digite a altura do atleta:");
        double altura = scanner.nextDouble();

        System.out.println("Digite o peso do atleta:");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        Atleta atleta1 = new Atleta(nome, genero, idade, altura, peso);

        System.out.println("Digite a modalidade do competidor:");
        String modalidade = scanner.nextLine();

        System.out.println("Digite o país do competidor:");
        String pais = scanner.nextLine();

        Competidor competidor1 = new Competidor(modalidade, pais, nome, genero, idade, altura, peso);

        System.out.println(atleta1.mostrarAtleta());
        System.out.println(competidor1.mostrarCompetidor());

        scanner.close();


    


        
    }
}
