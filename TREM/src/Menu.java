import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    GaragemLocomotiva g = new GaragemLocomotiva();
     //Locomotivas para exemplo
     Locomotiva lc1 = new Locomotiva(0, 1, 9999, 100, g);
     Locomotiva lc2 = new Locomotiva(0, 2, 9999, 100, g);
     Locomotiva lc3 = new Locomotiva(0, 3, 9999, 100, g);
     Locomotiva lc4 = new Locomotiva(0, 4, 9999, 100, g);

    public void menuTrem() {
        for (;;) {
            System.out.println("Bem vindo ao menu do sistema de trens.");
            System.out.println("1. Criar trem.");
            System.out.println("2. Editar trem.");
            System.out.println("3. Listar trens criados.");
            System.out.println("4. Desfazer trem.");
            System.out.println("5. Fim.");
            System.out.print("Digite a opção desejada: ");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Para criar um trem, indique o identificador dele: ");
                    int identificadorTrem = sc.nextInt();
                    Trem t = new Trem(identificadorTrem);
                    System.out.println("***Lista de locomotivas na garagem***");
                    g.imprimeLocomotivasNaGaragem();
                    System.out.println("Selecione a Locomotiva desejada: ");
                    int idLocomotiva = sc.nextInt();
                    t.engataLocomotiva(idLocomotiva);
                    continue;
                case 2:
                    // Editar trem
                    continue;
                case 3:
                    // Listar trens criados
                    Patio.imprimeTrensCriados();
                    continue;
                case 4:
                    // Desfazer trem
                    System.out.println("Selecione o trem a ser desfeito: ");
                    Patio.imprimeTrensCriados();
                    System.out.println("Trem desejado: ");
                    int idTrem = sc.nextInt();
                    Patio.getTrensNoPatio().remove(Trem.procuraTrem(idTrem));
                    System.out.println("Remoção concluida");
                    continue;
                case 5:
                    System.out.println("Saindo...");
                    break;
            }
            break;
        }

    }
}
