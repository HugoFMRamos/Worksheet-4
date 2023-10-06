public class Aluno {

    private String nome;
    private String matricula;
    private double totalPago;
    private int num;

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public int getNum() {
        return num;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Aluno(String nome, String matricula, double totalPago, int num) {

        this.nome = nome;
        this.matricula = matricula;
        this.totalPago = totalPago;
        this.num = num;
    }

    //TesteGitt
}

