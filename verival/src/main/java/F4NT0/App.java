package F4NT0;

/**
 * Autor: Gabriel Fanto Stundner
 * Dificuldade: Não consegui colocar o POM.xml e Funcionar
 */

public class App 
{
    public int[] qtdadeBarras(int peso){
        int quantidade5Quilos;
        int quantidade1Quilos;
        int[] saida = new int[2];
        if(peso >= 5){
            quantidade5Quilos = peso/5;
            quantidade1Quilos = peso%5;
            saida[0] = quantidade5Quilos;
            saida[1] = quantidade1Quilos;
        }else{
            quantidade1Quilos = peso;
            saida[0] = 0;
            saida[1] = quantidade1Quilos;
        }
        return saida;
    }

    public static void main( String[] args ){
        App teste = new App();
        int[] saida = teste.qtdadeBarras(4);
        for(int i = 0 ; i < saida.length ; i++){System.out.print(" [ " + saida[i] + " ] ");}
    }
}
