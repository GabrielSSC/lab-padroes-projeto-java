public class DescontoNenhum implements DescontoStrategy {
    @Override
    public double calcularDesconto(double valorTotal) {
        return valorTotal;
    }
}
