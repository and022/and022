import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lojas Americanas controle de produtos e funcionarios!");

        Produtos estoque = new Produtos("Sansumg", 150, "Eletrolux", 25, "Trakinas", 520, "Coca - Cola", 1500, "Tio João", 430, "Tilibra", 45, "Bic", 10500, "Faber-Castell", 5000, "Faber - Castell", 1200);
        Funcionario colaborador1 = new Funcionario("Pedro Assis", 25, "Repositor", "Masculino", 1200.00);
        Funcionario colaborador4 = new Funcionario("Mariana Santos", 22, "Caixa", "Feminino", 1500.00);
        Funcionario colaborador2 = new Funcionario("Ana Carolina", 28, "Gerente de Loja", "Feminino", 3500.00);
        Funcionario colaborador3 = new Funcionario("Lucas Silva", 35, "Vendedor", "Masculino", 2000.00);
        Funcionario colaborador5 = new Funcionario("Juliana Almeida", 27, "Gerente de Estoque", "Feminino", 4000.00);
        Funcionario colaborador6 = new Funcionario("Carlos Eduardo", 40, "Diretor", "Masculino", 8000.00);  
        Funcionario colaborador = new Funcionario("Andre Neri Batista", 30, "Auxiliar de Escritorio", "Masculino", 2500.00);
        Filiais filial_sede = new Filiais("São Jose dos Campos", "São Paulo", 2590);
        Filiais filial_1 = new Filiais("São Paulo", "São Paulo", 1500);
        Filiais filial_2 = new Filiais("Rio de Janeiro", "Rio de Janeiro", 2000);
        Filiais filial_3 = new Filiais("Belo Horizonte", "Minas Gerais", 1200);
        Filiais filial_4 = new Filiais("Curitiba", "Paraná", 800);
        Scanner americanas = new Scanner(System.in);

        // Class Produtos
        System.out.println("Digite o Codigo de acesso:");
        int RA = americanas.nextInt();

        if (RA == 2025){
            System.out.println("acesso liberado!");
            estoque.implementando_produtos();
        }else{
            System.out.println("Acesso negado!");
            System.exit(0);
        }

        System.out.println("Produtos disponiveis:");
        System.out.println("=====================================================");

        // Class Funcionario 
        Scanner americanas1 = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.println("Digite o nome do funcionario:");
        String nome = americanas1.next();

        String nome1 = "Andre";
        if(nome.equals(nome1)){
            System.out.println("Acesso Liberado!");
            colaborador.implementando_funcionario();
            System.out.println("=====================================================");
            colaborador1.implementando_funcionario();
            System.out.println("=====================================================");
            colaborador2.implementando_funcionario(); 
            System.out.println("=====================================================");  
            colaborador3.implementando_funcionario();
            System.out.println("=====================================================");
            colaborador4.implementando_funcionario();
            System.out.println("=====================================================");
            colaborador5.implementando_funcionario();
            System.out.println("=====================================================");
            colaborador6.implementando_funcionario();
            System.out.println("=====================================================");
        }else{
            System.out.println("Acesso Negado!");
            System.exit(0);
        }

        System.out.println("=====================================================");
        System.out.println("=====================================================");

        // Class Filiais

        Scanner americanas2 = new Scanner(System.in);   
        System.out.println("Digite o id do Gerente:");
        int id = americanas2.nextInt();

        int id_gerente = 1925;
        if(id == id_gerente){
            System.out.println("Acesso liberado!");
            filial_sede.implementando_filiais();
            System.out.println("=====================================================");
            filial_1.implementando_filiais();
            System.out.println("=====================================================");
            filial_2.implementando_filiais();
            System.out.println("=====================================================");
            filial_3.implementando_filiais();
            System.out.println("=====================================================");    
            filial_4.implementando_filiais();
            System.out.println("=====================================================");
        }else{
            System.out.println("Acesso negado!");
            System.exit(0);
        }
       
    }
}
