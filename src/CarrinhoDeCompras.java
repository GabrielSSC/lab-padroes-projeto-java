public class CarrinhoDeCompras {
    private double valorTotal;
    private DescontoStrategy descontoStrategy;

    public CarrinhoDeCompras(double valorTotal) {
        this.valorTotal = valorTotal;
        // Estratégia padrão: sem desconto
        this.descontoStrategy = new DescontoNenhum();
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularValorFinal() {
        return descontoStrategy.calcularDesconto(valorTotal);
    }
}