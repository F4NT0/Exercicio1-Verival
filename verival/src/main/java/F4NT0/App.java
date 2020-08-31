package F4NT0;

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
            saida[0] = null;
            saida[1] = quantidade1Quilos;
        }
        return saida;
    }

    public static void main( String[] args )
    {
        
    }
}
