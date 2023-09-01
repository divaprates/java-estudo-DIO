public class ExemploExcecao {
    public static void main(String[] args) throws Exception {
        try {
            String cepFormatado = formatarCep("90888000");
            System.out.println("Cep: " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Cep inválido!");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return "00.000-000";
    }
}
