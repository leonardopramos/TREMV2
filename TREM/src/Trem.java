import java.util.ArrayList;

public class Trem{

    private int identificadorTrem;
    private static ArrayList<Trem> lista = new ArrayList<Trem>();
    private int tamanhoDaLista = lista.size();
  
    //Este patio P é o pátio onde esse trem que está sendo criado irá estar
    public Trem(int identificadorTrem, String adiciona){
        this.identificadorTrem = identificadorTrem;
        adiciona.toLowerCase();
        if(adiciona.equals("sim") || adiciona.equals("s")){
            Patio.getTrensNoPatio().add(this);
        }
    }
   

    public int getIdentificadorTrem() {
        return identificadorTrem;
    }
    public void imprimeLista(){
        for(int i = 0; i < lista.size(); i++){
            System.out.print(lista.get(i));
        }
    }
    public ArrayList<Trem> getLista() {
        return lista;
    }
    public int getTamanhoDaLista() {
        return tamanhoDaLista;
    }

    public void engataLocomotiva(int idLocomotiva){
        Trem.lista.add(Locomotiva.procuraLocomotiva(idLocomotiva));
        GaragemLocomotiva.getListaGarageLocomotivas().remove(Locomotiva.procuraLocomotiva(idLocomotiva));
    }

    public void engataVagao(int idVagao){
        Trem.lista.add(Vagao.procuraVagao(idVagao));
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