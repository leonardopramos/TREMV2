import java.util.ArrayList;

public class Trem{

    private int identificadorTrem;
    private static ArrayList<Locomotiva> listaLocomotiva = new ArrayList<Locomotiva>();
    private static ArrayList<Vagao> listaVagao = new ArrayList<Vagao>();
    private int tamanhoListaLocomotiva = listaLocomotiva.size();
    private int tamanhoListaVagao = listaVagao.size();
  
    //Este patio P é o pátio onde esse trem que está sendo criado irá estar
    public Trem(int identificadorTrem){
        this.identificadorTrem = identificadorTrem;
        Patio.getTrensNoPatio().add(this);
    }
   

    public int getIdentificadorTrem() {
        return identificadorTrem;
    }
    public void imprimeListaDeLocomotivasDoTrem(){
        for(int i = 0; i < listaLocomotiva.size(); i++){
            System.out.print(listaLocomotiva.get(i));
        }
    }
    public ArrayList<Locomotiva> getListaLocomotiva() {
        return listaLocomotiva;
    }
    public ArrayList<Vagao> getListaVagao() {
        return listaVagao;
    }
    public int getTamanhoListaLocomotiva() {
        return tamanhoListaLocomotiva;
    }
    public int getTamanhoListaVagao() {
        return tamanhoListaVagao;
    }

    public void engataLocomotiva(int idLocomotiva){
        Trem.listaLocomotiva.add(Locomotiva.procuraLocomotiva(idLocomotiva));
        GaragemLocomotiva.getListaGarageLocomotivas().remove(Locomotiva.procuraLocomotiva(idLocomotiva));
    }

    public void engataVagao(int idVagao){
        Trem.listaVagao.add(Vagao.procuraVagao(idVagao));
        GaragemVagao.getListaGaragemVagao().remove(Vagao.procuraVagao(idVagao));
    }

    public static Trem procuraTrem(int idTrem){
        for(int i = 0; i < Patio.getTrensNoPatio().size(); i++){
            if(Patio.getTrensNoPatio().get(i).identificadorTrem == idTrem){
                return Patio.getTrensNoPatio().get(i);
            }
        }
        return null;
    }
    @Override
    public String toString() {
        String aux = " ";
        aux += "Trem: " + identificadorTrem + "\n"; 
        return aux;
    }
}