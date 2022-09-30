import java.util.ArrayList;

public class GaragemVagao{

    private static ArrayList<Vagao> listaGaragemVagao = new ArrayList<Vagao>();

    public static ArrayList<Vagao> getListaGaragemVagao(){
        return listaGaragemVagao;
    }

    public void imprimeLocomotivasNaGaragem(){
        for(int i = 0; i < listaGaragemVagao.size(); i++){
            System.out.println(listaGaragemVagao.get(i));
        }
    }
}
