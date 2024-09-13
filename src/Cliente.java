public class Cliente {
    private String nome;
    private long cpf;
    private float totalCompra;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.totalCompra = 0;
    }

    public void adicionaCompra(float valor) {
        this.totalCompra += valor;
    }

    public float calculaTotalCompra() {
        return this.totalCompra;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }
}
