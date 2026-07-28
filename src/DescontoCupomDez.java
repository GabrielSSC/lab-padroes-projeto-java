public class DescontoCupomDez implements DescontoStrategy {
    @Override
    public double calcularDesconto(double valorTotal) {
        return valorTotal * 0.90; // 10% de desconto
    }
}
