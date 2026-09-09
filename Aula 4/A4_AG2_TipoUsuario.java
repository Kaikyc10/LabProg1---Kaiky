public class A4_AG2_TipoUsuario {
    public static void main(String[] args) {
        String perfil = "ADMIN";

        switch (perfil) {
            case "ADMIN":
                System.out.println("Acesso total ao sistema");
                break;
            case "GERENTE":
                System.out.println("Acesso gerencial");
                break;
            case "USUÁRIO":
                System.out.println("Acesso básico");
                break;

            default:
                System.out.println("Escreve direito fdp");
                break;
        }
    }
}
