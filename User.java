public class User {
    private String nome = "Thiago";
    private String email = "thiago@thiago.com";
    private String cpf = "111.222.333-44";
    private int idade = 18;
    Endereco endereco = new Endereco();
    int periodo;

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public int getIdade() {
        return this.idade;
    }

    void avancarPeriodo() {
        this.periodo += 1;
    }
}
