
import java.util.Scanner;
import java.io.IOException;
import java.net.InetAddress;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        //Criando a opçao de digitar o ip desejado

        System.out.println("BEM VINDO AO NOSSO SCANNER DE REDE!");
        System.out.println("Digite o ip desejado:");
        String subnet = scan.nextLine();

        Integer timeout = 1000;

        // FAZENDO OU CRIANDO DE COMO O SCANNER IRA FAZER A BUSCA DO IP NESSE CASSO ELE IRA BUSCAR O IP COM O COMEÇO 0 ATÉ 255
        

        
        for(int i = 1; i <255; i++){
            String host = subnet +i;

             // Usaremos o TRY E O CATCH PARA DEFNIR PARAMETROS COMO TIMEOUT (TEMPO DE RESPOSTA DA SOLICITAÇAO DO USUARIO )

           try{InetAddress address = InetAddress.getByName(host);
            if(address.isReachable(timeout)){
                System.out.println(host+"Ip scaneado com sucesso!");
            }

           }catch(IOException e ){
            System.out.println("Erro Ao escanear o ip"+"porta"+host);

           }

        }



        
        
    }
}
