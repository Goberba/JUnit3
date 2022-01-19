import java.util.Arrays;

public class MultiplosNumero1hastaM {
	
	public static int leerN() {
		System.out.println("Dime la N");
		int n=Console.readInt();
		while(n<0) {
			System.out.println("N tienen que ser positivo.");
			n=Console.readInt();
		}
		return n;
	}
	
	public static int leerM(int n) {
		System.out.println("Dime la M");
		int m=Console.readInt();
		while(m<0 || m<n) {
			System.out.println("M tienen que ser positivo y mayor a N.");
			m=Console.readInt();
		}
		return m;
	}
	
	public static String multiplosNyM(int n, int m) {
		int contador=0;
		for(int i=1;i<=m;i++) {
			if(i%n==0) {
				contador++;
			}
		}
		int arrayfinal[]=new int [contador];
		for(int i=0;i<contador;i++) {
			for(int j=1;j<=m;j++)
				if(j%n==0) {
					arrayfinal[i]=j;
					i++;
				}
		}
		String a=Arrays.toString(arrayfinal);
		return a;
	}

	public static void main(String[] args) {
		int n=leerN();
		int m=leerM(n);
		System.out.println(multiplosNyM(n,m));

	}

}
