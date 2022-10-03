import java.util.ArrayList;

public class Patio {
    
    private static ArrayList<Trem> trensNoPatio = new ArrayList<Trem>();

    public static ArrayList<Trem> getTrensNoPatio() {
        return trensNoPatio;
    }
    
    public static void imprimeTrensCriados(){
        for(int i = 0; i < trensNoPatio.size(); i++){
            System.out.println(trensNoPatio.get(i));
        }
    }
}
