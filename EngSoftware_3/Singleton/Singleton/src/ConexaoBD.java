public class ConexaoBD {
    private static ConexaoBD instance;
    private ConexaoBD(){
    }
    public static ConexaoBD getInstance(){
        if( instance == null ){
            instance = new ConexaoBD();
        }
        return instance;
    }

    public void getConexaoBD(){
        System.out.println("Você foi conectado ao banco de dados com sucesso.");
    }

}