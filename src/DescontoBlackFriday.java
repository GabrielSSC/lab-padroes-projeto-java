public class DescontoBlackFriday implements DescontoStrategy {
    @Override
    public double calcularDesconto(double valorTotal) {
        return valorTotal * 0.70; // 30% de desconto
    }
}