import java.util.Scanner;

public class Resolucao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean p;
		boolean q;
		boolean r;
		String valorP, valorQ, valorR;
		String pvq;
		String pvr;
		String qandr;
		String pvqandr;
		String pvqandqvr;
		String resultado;
		String resultadofinal;

		System.out.println("Questão: ");
		System.out.println("Dado a equação pv(q^r) <-> (pvq)^(pvr), escolha os valores verdade de p, q e r: ");
		System.out.println();
		System.out.println("Defina o valor verdade de p, ele é falso ou verdadeiro?");
		valorP = sc.next();
		if (valorP.equals("verdadeiro") || valorP.equals("Verdadeiro")) {
			p = true;
			valorP = "V";
		} else {
			p = false;
			valorP = "F";
		}
		System.out.println("Defina o valor verdade de q, ele é falso ou verdadeiro?");
		valorQ = sc.next();
		if (valorQ.equals("verdadeiro") || valorQ.equals("Verdadeiro")) {
			q = true;
			valorQ = "V";
		} else {
			q = false;
			valorQ = "F";
		}
		System.out.println("Defina o valor verdade de r, ele é falso ou verdadeiro?");
		valorR = sc.next();
		if (valorR.equals("verdadeiro") || valorR.equals("Verdadeiro")) {
			r = true;
			valorR = "V";
		} else {
			r = false;
			valorR = "F";
		}

		System.out.println("Dado: ");
		System.out.println("Valor verdade de p = " + valorP);
		System.out.println("Valor verdade de q = " + valorQ);
		System.out.println("Valor verdade de r = " + valorR);
		if ((p || q) == true) {
			pvq = "V";
		} else {
			pvq = "F";
		}
		if ((p || r) == true) {
			pvr = "V";
		} else {
			pvr = "F";
		}
		if ((q && r) == true) {
			qandr = "V";
		} else {
			qandr = "F";
		}
		if((p ||(q && r)) == true){
			pvqandr = "V";
			resultado = "V";
		}else{
			pvqandr = "F";
			resultado = "F";
		}
		if(((p||q)&&(q || r)) == true){
			pvqandqvr = "V";
		}else{
			pvqandqvr = "F";
		}
		
		if(resultado.equals("V")){
			resultadofinal = "Verdadeiro";
		}else{
			resultadofinal = "Falso";
		}
		System.out.println("A resolução da equação é: ");
		System.out.println("  p  |  q  |  r  |  q^r  |  pvq  |   pvr |  pv(q^r)  | (pvq)^(qvr) |  pv(q^r) <-> (pvq)^(pvr) ");
		System.out.println("  "+valorP + "  |  " + valorQ + "  |  " + valorR + "  |   " + qandr + "   |   " + pvq + "   |    " + pvr + "  |      "+pvqandr+"    |      "+pvqandqvr+"      |           "+resultado+"");
		System.out.println();
		System.out.println("Logo, o resultado da equaçao é "+ resultadofinal);
		sc.close();
	}

}
