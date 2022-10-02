public class App2 {
    

    public static void main(String[] args) {
        
        Trem t = new Trem(1, "sim");
        Trem t1 = new Trem(2, "sim");
        GaragemLocomotiva g = new GaragemLocomotiva();
        Locomotiva lc1 = new Locomotiva(0, 0, 0, g);
        Vagao v1 = new Vagao(0, 0, t); 

        Patio.imprimeTrensCriados();
    }
}
