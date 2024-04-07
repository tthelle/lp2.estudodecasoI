package Q1;
import java.util.Scanner;

public class Carro{
    private String modelo;
    private double velocidade, aceleracao;
    private int marcha;
    private boolean ligado;

    public Carro (String modelo, double aceleracao){
        this.modelo = modelo;
        this.velocidade = 0;
        this.aceleracao = aceleracao;
        this.marcha = 0;
        this.ligado = false;
    }

    public void acoesCarro(){
        int opcao;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Desacelerar");
            System.out.println("5 - Virar para a esquerda");
            System.out.println("6 - Virar para a direita");
            System.out.println("7 - Subir a marcha");
            System.out.println("8 - Descer a marcha");
            System.out.println("9 - Encerrar ações");
            System.out.println("Selecione o que deseja realizar com o carro: ");
            opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                    ligar();
                    break;
                case 2:
                    desligar();
                    break;
                case 3:
                    acelerar();
                    break;
                case 4:
                    desacelerar();
                    break;
                case 5:
                    virarEsquerda();
                    break;
                case 6:
                    virarDireita();
                    break;
                case 7:
                    marchaCima();
                    break;
                case 8:
                    marchaBaixo();
                    break;
                case 9:
                    System.out.println("Ações encerradas.");
                    break;
                default:
                    System.out.println("Informe uma ação válida.");
                    break;
            }
        } while(opcao != 9);
    }

    public void ligar(){
        ligado = true;
        System.out.println("O carro foi ligado.");
    }

    public void desligar(){
        ligado = false;
        System.out.println("O carro foi desligado.");
    }

    public void acelerar(){
        if(ligado){
            velocidade += aceleracao;
            System.out.println("O carro está acelerando. \nVelocidade atual: " +velocidade);
        } else {
            System.out.println("Ligue o carro para poder acelerar.");
        }
    }

    public void desacelerar(){
        if((ligado) && (velocidade > 0)){
            velocidade -= aceleracao;
            System.out.println("O carro está desacelerando. \nVelocidade atual: " +velocidade);
        } else {
            System.out.println("Ligue e acelere o carro para poder desacelerar.");
        }
    }

    public void virarEsquerda(){
        if(ligado){
            System.out.println("O carro esta virando para a esquerda.");
        } else {
            System.out.println("Ligue o carro para poder virar para a esquerda.");
        }
    }

    public void virarDireita(){
        if(ligado){
            System.out.println("O carro esta virando para a direita.");
        } else {
            System.out.println("Ligue o carro para poder virar para a direita.");
        }
    }

    public void marchaCima(){
        if(ligado){
            marcha++;
            System.out.println("A marcha foi aumentada. \nMarcha atual: " +marcha);
        } else {
            System.out.println("Ligue o carro para poder mudar a marcha.");
        }
    }

    public void marchaBaixo(){
        if((ligado) && (marcha > 0)){
            marcha--;
            System.out.println("A marcha foi diminuida. \nMarcha atual: " +marcha);
        } else {
            System.out.println("Ligue o carro para poder mudar a marcha.");
        }
    }
}
