public class Vagao extends Trem{

    private int identificadorVagao;
    private double capacidadeMaxCarga;
    private Trem tremAtual = null;

    public Vagao(int identificadorTrem, int identificadorVagao, double capacidadeMaxCarga, Trem tremAtual) {
        super(identificadorTrem);
        this.identificadorVagao = identificadorVagao;
        this.capacidadeMaxCarga = capacidadeMaxCarga;
        this.tremAtual = tremAtual;
        tremAtual.getListaVagao().add(this);

        if (tremAtual.getIdentificadorTrem() != identificadorTrem){
            System.out.println("Identificador de trem não coincide com o identificador do trem passado por parâmetro.");
            identificadorTrem = tremAtual.getIdentificadorTrem();
        }
    }
}
