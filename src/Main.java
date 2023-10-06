import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    private static Parque parque;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 1;

        while(option != 0) {
            System.out.println("--- Parking System ---");
            System.out.println("1 - Enter park");

            option = input.nextInt();

            if(option == 1 && parque.getEstacionamentos().size() < parque.getMaximumCapacity()) {
                Aluno aluno = addAluno();
                Estacionamento estacionamento = new Estacionamento(aluno, LocalDateTime.now());
                parque.getEstacionamentos().add(estacionamento);
            } else {
                System.out.println("The park is at maximum capacity.");
            }
        }
    }

    private static Aluno addAluno() {
        System.out.println("Name?");
        String nome = input.nextLine();
        System.out.println("Stundent Number?");
        String number = input.nextLine();
        System.out.println("License Plate?");
        String licensePlate = input.nextLine();

        return new Aluno(nome, number, licensePlate, 0);
    }
}
