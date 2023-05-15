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
}