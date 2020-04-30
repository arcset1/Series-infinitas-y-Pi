import java.util.Scanner;


public class pi{


	public static void menu(){
	
		System.out.println("Metodo 1 Suma de inversos enteros positivos[1]");
		System.out.println("Metodo 2 Suma de impares					[2]");
		System.out.println("3 Producto de Wallis 						[3]");
	}

	
	public static double pi1(){

	int i;
	int j;
	int termino;
	int contador;
	double suma;
	double a;
	double resultado;
	
	Scanner entrada1;
	entrada1 = new Scanner(System.in);


	System.out.println("Dame la cantidad de terminos");
	
	 	termino=entrada1.nextInt();

	suma=0;
	a=1;
	contador=0;
		
	for(i=1;i<=termino;i++){
		
		a=1/(Math.pow(i,2)); //Usamos la Jerarquía para forzar a realizar el exp
		System.out.println("1 / "+a);
		suma=suma+a;
		System.out.println(suma);
		contador++;
	}

	resultado=suma*6;

	resultado=Math.sqrt(resultado);

	System.out.println("PI= "+resultado);
			
	
	return resultado;
	}

	public static double pi2(){
		
		int i;
		int j;
		int a;
		double d;
		double suma;
		int termino;
		Scanner in;
		in = new Scanner(System.in);
		
		System.out.println("Introduce el numero de terminos, entre más terminos; mas exactitud");
		
		termino = in.nextInt();
		termino= termino*2;
		System.out.println(termino);
		suma=0;
		a=1;
		double term=0;
		int x=1;
		int desc;
		d=1;
		double m;//variable de tipo double para realizar la div
		m=1;
		for(i=1;i<=termino;i++){
			a=i%2;
			if(a!=0){
				//System.out.println(i);
				desc=x%2;
				if(desc==0){
				d=(1/m)*(-1);
				//System.out.println(d);
				suma=suma+d;
				}
				if(desc!=0){
					d=1/m;
					//System.out.println(d);
					suma=suma+d;
					}	
				
				x++;
				
				
				}
			m++;
			}
			
		suma=suma*4;
		System.out.println("PI="+suma);	
			
		
		
		return suma;
		}


	public static double pi3(){
		
		double pi = 0;
    double a = 0;
    double b = 1;
    double denom = 0;
    double num = 0;
    double temp = 0;
    double contador = 0;
    double pimedios = 1;
    Scanner in;
    in = new Scanner(System.in);
    int termino;
    double resultado;

		System.out.println("Introduce el numero de terminos");
		termino=in.nextInt();

        while(true) {
          temp = b;
          b = temp + 2;
          denom = temp*b;

          a += 2;
          num = a*a; 

          pimedios *= (num/denom);
          contador++;
          
          resultado=pimedios*2;

          System.out.println(pimedios*2);
          
          if(contador == termino){break;}
		}
	
		
		return resultado;
		}
		
		
		
		
		
	public static void main(String Args[]){
		int i;
		int j;
		Scanner entrada;
		entrada = new Scanner(System.in);
		int op;
		
		do{
		
		menu();
		
		do{
			System.out.println("Ingreasa un numero entero entre 1 y 3");
			op=entrada.nextInt();
			
			}while(op>4);
		
		
		
		switch(op){
			case 1: pi1(); break;
			case 2: pi2(); break;
			case 3: pi3(); break;
			}
		
		
	System.out.println("¿Otro metodo? Sí [1] No [2]");
	int op2;
	op=entrada.nextInt();

	}while(op == 1);

	}



	}
