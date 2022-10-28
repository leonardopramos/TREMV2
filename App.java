import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        ListaAtendimentos ls = new ListaAtendimentos();

        Cabine c1 = new Cabine(1);
        Cabine c2 = new Cabine(2);
        Cabine c3 = new Cabine(3);
        Cabine c4 = new Cabine(4);
        Cabine c5 = new Cabine(5);

        c1.getFilaDeCarros().adicionar(new Veiculo("IMO3038", "Carro"));
        c1.getFilaDeCarros().adicionar(new Veiculo("GOR0405", "Carro"));
        c2.getFilaDeCarros().adicionar(new Veiculo("OJT0495", "Carro"));
        c2.getFilaDeCarros().adicionar(new Veiculo("ASF4535", "Carro"));
        c3.getFilaDeCarros().adicionar(new Veiculo("OTK0453", "Carro"));
        c3.getFilaDeCarros().adicionar(new Veiculo("MKH0453", "Carro"));
        c4.getFilaDeCarros().adicionar(new Veiculo("IZH3423", "Carro"));
        c4.getFilaDeCarros().adicionar(new Veiculo("PHL3495", "Carro"));
        c5.getFilaDeCarros().adicionar(new Veiculo("OKR0453", "Carro"));
        c5.getFilaDeCarros().adicionar(new Veiculo("HTO0345", "Carro"));

        int tempo = 0;
        Scanner sc = new Scanner(System.in);

        while(tempo < 86400){
            System.out.println("Teste de simulação");
            System.out.println("Status atual: ");


            System.out.println("Tempo: " + tempo);
            System.out.println("Cabine 1: " + c1.getFilaDeCarros());
            System.out.println("Cabine 2: " + c2.getFilaDeCarros());
            System.out.println("Cabine 3: " + c3.getFilaDeCarros());
            System.out.println("Cabine 4: " + c4.getFilaDeCarros());
            System.out.println("Cabine 5: " + c5.getFilaDeCarros());



            System.out.println("Status da lista de atendidos.");
            System.out.println(ls.getAtendidos());

            if(c1.getFilaDeCarros().retornaPrimeiro() != null){
                ls.getAtendidos().adicionar(c1.getFilaDeCarros().retornaPrimeiro().veiculo);
                c1.getFilaDeCarros().remover();
            }


            System.out.println("Para continuar a simulação aperte qualquer tecla.");
            tempo = tempo + 5;
            sc.next();
            continue;
        }
    }
}
