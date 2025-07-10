import java.util.Scanner;
import java.io.IOException;
import java.net.InetAddress;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        // Criando a opção de digitar o IP desejado
        System.out.println("BEM-VINDO AO NOSSO SCANNER DE REDE!");
        System.out.print("Digite o início do IP (ex: 192.168.0.0) rede Lan: ");
        String subnet = scan.nextLine();

        int timeout = 1000;

        // Scanner de IPs de 1 a 254 (evitando 0 e 255 por padrão)
        for (int i = 1; i < 255; i++) {
            String host = subnet + i;

            // Usamos try-catch para tratar exceções e definir o tempo de resposta (timeout)
            try {
                InetAddress address = InetAddress.getByName(host);
                if (address.isReachable(timeout)) {
                    System.out.println(host + " está acessível!");
                }
            } catch (IOException e) {
                System.out.println("Erro ao escanear o IP: " + host);
            }
        }

        scan.close();
    }
}
