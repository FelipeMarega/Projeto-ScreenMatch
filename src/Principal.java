public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Filme 1";
        meuFilme.anoDeLancamento = 1952;
        meuFilme.duracaoEmMinutos = 120;

        meuFilme.ExibeFichaTecnica();

        meuFilme.Avalia(10);
        meuFilme.Avalia(8);

        System.out.println(meuFilme.PegaSomaAvaliacoes());
        System.out.println(meuFilme.PegaTotalAvaliacoes());
    }
}
