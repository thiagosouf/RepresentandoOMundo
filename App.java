public class App {
    public static void main(String[] args) throws Exception {
        User user = new User();

        user.periodo = 1;

        System.out.println(user.periodo);
        user.avancarPeriodo();
        System.out.println(user.periodo);
    }
}
