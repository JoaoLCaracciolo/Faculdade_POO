import java.util.*;
public class TesteFuncionario {

	public static void main(String[] args) {
		
	
		Scanner ler = new Scanner(System.in);
		
		Funcionario funcionario1 = new Funcionario();
		
		//opção1
		funcionario1.nome = "Pablo Donato Carminatti";
		funcionario1.endereco = "Rua Alto Bonito";
		funcionario1.cidade = "Marabá";
		funcionario1.bairro = "São Félix Pioneiro";
		funcionario1.foneResidencial = "(91) 2344-0316";
		funcionario1.foneCelular = "(94) 98067-6105";
		funcionario1.email = "pablo.carminatti@gmail.com.br";
		
		//opção2
		funcionario1.matricula = 2131;
		funcionario1.cargo = "Engenheiro Civil";
		funcionario1.funcao = "Desenvolver projetos de engenharia, executar obras, planejar, orçar e contratar empreendimentos, coordenar a operação e a manutenção dos mesmos";
		funcionario1.turno = "matutino ";
		funcionario1.salario = 9982;

		
		int opcao;
		do{
			
			System.out.printf("1----Exibir dados pessoais\n2----Exibir dados profissionais\n3----Sair\n");
			System.out.printf("Digite a opção desejada:");
			opcao = ler.nextInt();

			
			switch(opcao) {
			
			 case 1: System.out.printf("\n------Dados pessoais------\nNome-----%s\nEndereço-----%s\nCidade-----%s\nBairro-----%s\nFone Residencial-----%s\nFone Celular-----%s\nEmail-----%s\n\n",funcionario1.nome,funcionario1.endereco,funcionario1.cidade,funcionario1.bairro,funcionario1.foneResidencial,funcionario1.foneCelular,funcionario1.email);
			 ;break;
			
			 		//System.out.println(funcionario1);
			 
			 case 2: System.out.printf("------Dados Profissionais------\nMatricula-----%d\nCargo-----%s\nFunção-----%s\nTurno-----%s\nSalario-----%2f\n\n",funcionario1.matricula,funcionario1.cargo,funcionario1.funcao,funcionario1.turno,funcionario1.salario);
			 break;
			 
			 case 3: ;break;
			 
			 default : System.out.printf("Opção invalida!!\n\n");return;
			}
			
			
		}while(opcao != 3);
		
		ler.close();
	}

}
