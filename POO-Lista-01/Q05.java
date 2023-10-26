public class Q05 {
    public static void main(String[] args) {
        int primeiroTermo = 0, segundoTermo = 1, proximoTermo = primeiroTermo + segundoTermo;
        while (proximoTermo <= 100) {
            System.out.print(primeiroTermo + " ");

            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
            proximoTermo = primeiroTermo + segundoTermo;
        }
    }
}