package Q2;
import java.util.Scanner;

public class Televisao {
    private int tamanho, volume, voltagem, canal;
    private String marca;
    private boolean ligada;

    public Televisao(String marca, int tamanho, int voltagem){
        this.marca = marca;
        this.tamanho = tamanho;
        this.volume = 5;
        this.voltagem = voltagem;
        this.canal = 0;
        this.ligada = false;
    }

    public void acoesTelevisao(){
        int opcao;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Aumentar o volume");
            System.out.println("4 - Diminuir o volume");
            System.out.println("5 - Subir o canal");
            System.out.println("6 - Descer o canal");
            System.out.println("7 - Encerrar ações");
            System.out.println("Selecione a opção desejada: ");
            opcao = teclado.nextInt();

            switch(opcao){
                case 1:
                    ligar();
                    break;
                case 2:
                    desligar();
                    break;
                case 3:
                    aumentarVolume();
                    break;
                case 4:
                    diminuirVolume();
                    break;
                case 5:
                    subirCanal();
                    break;
                case 6:
                    descerCanal();
                    break;
                case 7:
                    System.out.println("Ações encerradas.");
                    break;
                default:
                    System.out.println("Informe uma ação válida.");
                    break;
            }
        } while (opcao !=7);
    }

    public void ligar(){
        ligada = true;
        int consumo = voltagem * tamanho;
        System.out.println("A televisão foi ligada.\nTotal de consumo da televisão: " +consumo);
    }

    public void desligar(){
        ligada = false;
        System.out.println("A televisão foi desligada.");
    }

    public void aumentarVolume(){
        if(ligada){
            volume++;
            System.out.println("O volume foi aumentado. \nVolume atual: " +volume);
        } else {
            System.out.println("Não é possível aumentar o volume com a televisão desligada.");
        }
    }

    public void diminuirVolume(){
        if(ligada){
            volume--;
            System.out.println("O volume foi diminuido. \nVolume atual: " +volume);
        } else {
            System.out.println("Não é possível diminuir o volume com a televisão desligada.");
        }
    }

    public void subirCanal(){
        if(ligada){
            canal++;
            System.out.println("Foi subido 1 canal. \nCanal atual: " +canal);
        } else {
            System.out.println("Não é possível mudar o canal com a televisão desligada.");
        }
    }

    public void descerCanal(){
        if((ligada) && (canal > 0)){
            canal --;
            System.out.println("O descido 1 canal. \nCanal atual: " +canal);
        } else if (canal == 0) {
            System.out.println("Não há número de canal mais baixo que esse.");
        } else {
            System.out.println("Não é possível mudar o canal com a televisão desligada.");
        }
    }

}
