import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    private static Parque parque = new Parque();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 1;

        while(option != 0) {
            System.out.println("--- Parking System ---");
            System.out.println("1 - Enter park");
            System.out.println("2 - Leave park");

            option = input.nextInt();

            if(option == 1 && parque.getEstacionamentos().size() < parque.getMaximumCapacity()) {
                Aluno aluno = addAluno();
                Estacionamento estacionamento = new Estacionamento(aluno, LocalDateTime.now());
                parque.getEstacionamentos().add(estacionamento);
                isInsidePark = true;
            } else if (option == 1 && parque.getEstacionamentos().size() == parque.getMaximumCapacity()){
                System.out.println("The park is at maximum capacity.");
            }

            if(option == 2) {
                Aluno aluno = findAluno();

                if(aluno == null) {
                    System.out.println("Student doesn't exist.");
                }
            }
        }
    }

    private static Aluno addAluno() {
        System.out.println("Name?");
        String nome = input.nextLine();
        System.out.println("Stundent Number?");
        String numero = input.nextLine();
        System.out.println("License Plate?");
        String matricula = input.nextLine();

        return new Aluno(nome, numero, matricula, 0);
    }

    private static Aluno findAluno() {
        System.out.println("Name?");
        String nome = input.nextLine();

        for(int i = 0; i < parque.getEstacionamentos.size(); i++) {
            if(nome.equals(parque.getEstacionamentos.get(i).getAluno().getNome())) {
                return parque.getEstacionamentos.get(i).getAluno();
            }
        }
        return null;
    }
}
