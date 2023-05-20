import java.util.Scanner;


class ConversorCalendario {
		
	static int ano;
		
	public static boolean validarAno() {
		if(ano <= 0){
			return false;
		}
		return true;
    }
		
	  
		public static void main(String args[]){
			
			Scanner lerTeclado = new Scanner(System.in);
			 
			int calendario, anoC;
		
			System.out.print("DIGITE UM ANO");
			ano = lerTeclado.nextInt();
			
			if(validarAno() == false){
				System.out.printf("Insira um ano valido");
				System.exit(0);
			}

			
			System.out.print("MENU \n  ESCOLHA UM CALENDARIO: (1)JUDEU  (2)ISLAMICO");
			calendario = lerTeclado.nextInt();
			
			anoC = 0;
			
			  switch (calendario) {
			  case 1:
			  anoC = ano + 3760;
			  break;

			  case 2:
			  anoC = ano - 579;
			  break;
			  
			default:
			  System.out.printf("Insira uma opcao valida");
			  System.exit(0);
			}

				System.out.print("O ano convertido para o calendario escolhido eh " + anoC);
		}	
}