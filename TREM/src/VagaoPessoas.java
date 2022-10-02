public class VagaoPessoas extends Vagao{

    private int identificadorVagao;
    private double maxPessoas;

    public VagaoPessoas(int identificadorVagao, double maxPessoas, Trem tremAtual) {
        super(identificadorVagao, maxPessoas, tremAtual);
        this.identificadorVagao = identificadorVagao;
        this.maxPessoas = maxPessoas;
        tremAtual.getLista().add(this);
    }
    public VagaoPessoas(int identificadorVagao, double maxPessoas, GaragemVagao gV) {
        super(identificadorVagao, maxPessoas, gV);
        GaragemVagao.getListaGaragemVagao().add(this);
    }

    public int getIdentificadorVagao() {
        return identificadorVagao;
    }
    public double getCapacidadeMaxCarga() {
        return maxPessoas;
    }
    public static Vagao procuraVagao(int idVagao){
        for(int i = 0; i < GaragemVagao.getListaGaragemVagao().size(); i++){
            if(GaragemVagao.getListaGaragemVagao().get(i).getIdentificadorVagao() == idVagao){
                return GaragemVagao.getListaGaragemVagao().get(i);
            }
        }
        return null;
    }
    @Override
    public String toString() {
        String aux = " ";
        aux += "Vagao: " + getIdentificadorVagao() + "\n";
        return aux;
    }
}
