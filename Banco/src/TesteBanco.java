import java.util.*;

public class TesteBanco {

	public static void main(String[] args) {
		
		cliente cliente1 = new cliente();
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Dgite o nome:");
		cliente1.setNome(ler.next());		
		
		System.out.printf("Digite o cpf:");
		cliente1.setCpf(ler.next());
		
		System.out.printf("Dgite o profissão:");
		cliente1.setProfissao(ler.next());
		
		System.out.printf("Dgite a agencia:");
		cliente1.setAgencia(ler.nextInt());
		
		System.out.printf("Dgite o numero:");
		cliente1.setNumero(ler.nextInt());
		
		System.out.printf("Dgite o saldo:");
		cliente1.setSaldo(ler.nextDouble());
		
	
		System.out.printf("\nAgencia:%d \nNumero:%d \nSaldo:%.2f \nTitular Da conta:%s", cliente1.getAgencia(),cliente1.getNumero(),cliente1.getSaldo(),cliente1.getNome());
		
		System.out.println(cliente1);
		
		ler.close();
	}

}
