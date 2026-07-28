//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(100.0);

        System.out.println("Valor original: R$ " + carrinho.calcularValorFinal());

        // Aplicando cupom de 10%
        carrinho.setDescontoStrategy(new DescontoCupomDez());
        System.out.println("Com Cupom 10%: R$ " + carrinho.calcularValorFinal());

        // Mudando para promoção de Black Friday
        carrinho.setDescontoStrategy(new DescontoBlackFriday());
        System.out.println("Com Black Friday: R$ " + carrinho.calcularValorFinal());
    }
}