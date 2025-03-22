public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void ExibeFichaTecnica() {
        System.out.println(nome);
        System.out.println(anoDeLancamento);
    }

    void Avalia(double nota) {
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double PegaSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    int PegaTotalAvaliacoes() {
        return totalDeAvaliacoes;
    }
}