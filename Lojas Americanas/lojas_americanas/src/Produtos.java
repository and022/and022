public class Produtos {

   private String Televisao;
   private int quantidadeTelevisao;
   private String Geladeira;
   private int quantidadeGeladeira;
   private String Biscoito;
   private int quantidadeBiscoito;
    private String Refrigerante;
    private int quantidadeRefrigerante;
    private  String Arroz;
    private int quantidadeArroz;
    private  String Caderno;
    private int quantidadeCaderno;
    private  String Caneta;
    private int quantidadeCaneta;
    private  String Lapis;
    private int quantidadeLapis;
    private  String Borracha; 
    private int quantidadeBorracha;      

    public Produtos(String Televisao, int quantidadeTelevisao, String Geladeira, int quantidadeGeladeira, String Biscoito, int quantidadeBiscoito, String Refrigerante, int quantidadeRefrigerante, String Arroz, int quantidadeArroz, String Caderno, int quantidadeCaderno, String Caneta, int quantidadeCaneta, String Lapis, int quantidadeLapis, String Borracha, int quantidadeBorracha) {
        this.Televisao = Televisao;
        this.quantidadeTelevisao = quantidadeTelevisao;
        this.Geladeira = Geladeira;
        this.quantidadeGeladeira = quantidadeGeladeira;
        this.Biscoito = Biscoito;
        this.quantidadeBiscoito = quantidadeBiscoito;
        this.Refrigerante = Refrigerante;
        this.quantidadeRefrigerante = quantidadeRefrigerante;
        this.Arroz = Arroz;
        this.quantidadeArroz = quantidadeArroz;
        this.Caderno = Caderno;
        this.quantidadeCaderno = quantidadeCaderno;
        this.Caneta = Caneta;
        this.quantidadeCaneta = quantidadeCaneta;
        this.Lapis = Lapis;
        this.quantidadeLapis = quantidadeLapis;
        this.Borracha = Borracha;
        this.quantidadeBorracha = quantidadeBorracha;
    
    }

    public void implementando_produtos(){
       System.out.println("Marca da Televisao: " + Televisao);
       System.out.println("Quantidade disponivel em estoque: " + quantidadeTelevisao);
       System.out.println("Marca da Geladeira: " + Geladeira);
       System.out.println("Quantidade disponivel em estoque: " + quantidadeGeladeira);
       System.out.println("Marca do Biscoito: " + Biscoito); 
       System.out.println("Quantidade disponivel em estoque: " + quantidadeBiscoito);
       System.out.println("Marca do Refrigerante: " + Refrigerante);
       System.out.println("Quantidade disponivel em estoque: " + quantidadeRefrigerante);
       System.out.println("Marca do Arroz: " + Arroz);
       System.out.println("Quantidade disponivel em estoque: " + quantidadeArroz);
       System.out.println("Marca do Caderno: " + Caderno);
       System.out.println("Quantidade disponivel em estoque: " + quantidadeCaderno);
       System.out.println("Marca da Caneta: " + Caneta);  
       System.out.println("Quantidade disponivel em estoque: " + quantidadeCaneta);
       System.out.println("Marca do Lapis: " + Lapis);  
       System.out.println("Quantidade disponivel em estoque: " + quantidadeLapis);
       System.out.println("Marca da Borracha: " + Borracha);    
       System.out.println("Quantidade disponivel em estoque: " + quantidadeBorracha);
        
    }

}


