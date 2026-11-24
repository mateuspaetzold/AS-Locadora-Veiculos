public abstract class Veiculo implements Tarifavel {
    private int codigo;
    private String modelo;
    private double valorDiaria;
    private boolean disponivel;

    public Veiculo(int codigo, String modelo, double valorDiaria) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    public int getCodigo() { return codigo; }
    public String getModelo() { return modelo; }
    public double getValorDiaria() { return valorDiaria; }
    public boolean isDisponivel() { return disponivel; }

    public boolean alugar() {
        if (!disponivel) {
            return false;
        }
        disponivel = false;
        return true;
    }

    public boolean devolver() {
        if (disponivel) {
            return false;
        }
        disponivel = true;
        return true;
    }

    public boolean alterarValorDiaria(double novoValor) {
        if (novoValor > 0) {
            valorDiaria = novoValor;
            return true;
        }
        return false;
    }

    @Override
    public abstract double calcularValor(int dias);
}