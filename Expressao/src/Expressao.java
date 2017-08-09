
public class Expressao {

	private int op1;
	private int op2;
	private char opr;
	private int res;
	
	public int calcular(){
		switch (opr) {
			case '+':
				res = op1 + op2; 
				break;
			case '-':
				res = op1 - op2;		
				break;
			case '*':
				res = op1 * op2;
				break;
			case '/':
				res = op1 / op2;
				break;
			}
		return (res);	
	}
	public void setOp1(int op1){
		this.op1 = op1;
	}
	public void setOp2(int op2){
		this.op2 = op2;
	}
	public void setOpr(char opr){
		this.opr = opr;
	}
	
}
