public class Filiais {
    private String Cidade;
    private String Estado;
    private int quantidde_de_funcionarios;

    public Filiais(String Cidade, String Estado, int quantidde_de_funcionarios) {
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.quantidde_de_funcionarios = quantidde_de_funcionarios;
    }
    public void implementando_filiais(){
        System.out.println("Cidade da Filial: " + Cidade);
        System.out.println("Estado da Filial: " + Estado);
        System.out.println("Quantidade de funcionarios: " + quantidde_de_funcionarios);
    }

}
