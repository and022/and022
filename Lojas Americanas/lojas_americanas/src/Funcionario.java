public class Funcionario {
    private String nome_Funcionario;
    private int idade_Funcionario;
    private String cargo_Funcionario;
    private String Sexo_Funcionario;
    private double Salario_Funcionario;

    public Funcionario(String nome_Funcionario, int idade_Funcionario, String cargo_Funcionario, String Sexo_Funcionario, double Salario_Funcionario) {
        this.nome_Funcionario = nome_Funcionario;
        this.idade_Funcionario = idade_Funcionario;
        this.cargo_Funcionario = cargo_Funcionario;
        this.Sexo_Funcionario = Sexo_Funcionario;
        this.Salario_Funcionario = Salario_Funcionario;
        
    }
    public void implementando_funcionario(){
        System.out.println("Nome do Funcionario: " + nome_Funcionario);
        System.out.println("Idade do Funcionario: " + idade_Funcionario);
        System.out.println("Cargo do Funcionario: " + cargo_Funcionario);
        System.out.println("Sexo do Funcionario: " + Sexo_Funcionario);
        System.out.println("Salario do Funcionario: " + Salario_Funcionario);
    }

}
