public class Livro {
    private String titulo;
    private String autor;
    private int quantidadeExemplares;
    public Livro(String titulo, String autor, int quantidadeExemplares){
            titulo = titulo;
            autor = autor;
            quantidadeExemplares = quantidadeExemplares;
    }

    public int getQuantidadeExemplares(){

        return this.quantidadeExemplares;
    };
    public String getTitulo(){

        return this.titulo;
    }

}
