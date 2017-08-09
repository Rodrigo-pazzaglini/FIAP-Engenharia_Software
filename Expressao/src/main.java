
public class main {

	public static void main(String[] args) {
		Expressao expressao = new Expressao();
		int resultado;
		expressao.setOp1(2);
		expressao.setOp2(4);
		expressao.setOpr('-');
		resultado = expressao.calcular();
		System.out.println(resultado);
	}

}
