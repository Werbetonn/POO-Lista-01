public class Q04 {
    public static void main(String [] args){
        int valor = 150;
        int divisores = 0;
        for(int i=1; i<=valor; i++){
            if(valor%i==0){
                divisores++;
            }
        }
    if(divisores==2){
        System.out.println("O número é primo.");
    }else {
        System.out.println("O número não é primo.");
    }
}
}