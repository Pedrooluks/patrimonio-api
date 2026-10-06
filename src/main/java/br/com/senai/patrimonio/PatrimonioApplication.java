package br.com.senai.patrimonio;

import br.com.senai.patrimonio.atividades.Computador;
import br.com.senai.patrimonio.atividades.Equipamento;
import br.com.senai.patrimonio.atividades.Veiculo;
import br.com.senai.patrimonio.avaliacao.enums.Nivel;
import br.com.senai.patrimonio.avaliacao.Participante;
import br.com.senai.patrimonio.model.*;
import br.com.senai.patrimonio.model.enums.Cargo;
import br.com.senai.patrimonio.model.enums.EstadoConservacao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class PatrimonioApplication {

	public static void main(String[] args) {

		SpringApplication.run(PatrimonioApplication.class, args);

		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Senai LTDA");
		System.out.println(empresa.getRazaoSocial());

		Endereco endereco = new Endereco();
		endereco.setRua("Bela vista");
		System.out.println(endereco.getRua());
		System.out.println(endereco.getBairro());

		empresa.setEndereco(endereco);
		System.out.println(empresa.getEndereco().getRua());

		Endereco enderecoComArgumentos = new Endereco("Líbano jose gomes",
				"489", "Perto do posto de saúde",
				"Santa luzia","Criciúma", "SC");

		empresa.setEndereco(enderecoComArgumentos);
		System.out.println(empresa.getEndereco().getBairro());

		Sala sala = new Sala();

		Funcionario funcionario = new Funcionario(
				35L, "Mariazinha", "123456789",
				sala, empresa,Cargo.GERENTE );
		//System.out.println(funcionario.getCpf());

		//System.out.println(Pagamento.PIX);
		//System.out.println(PagamentoComposto.PIX.getDescricao());
		//System.out.println(PagamentoComposto.PIX);
		//System.out.println(PagamentoComposto.CARTAO_CREDITO);

        Participante participante = new Participante(
				"joão" , "joão@gmail.com" , "489999999" ,
				"4555255856", Nivel.INICIANTE
		);

		Empresa empresaInterface = new Empresa();

        Bloco blocoInterface = new Bloco (1l, "bloco 2" , empresaInterface);

        Sala salaInterface = new Sala(2l, "sala 28", "4567" , blocoInterface,
			  empresaInterface);

		System.out.println(salaInterface.getDescricaoLocalizavel());

		Patrimonio patrimonio = new Patrimonio();

		patrimonio.setEstado(EstadoConservacao.INSERVIVEL);
		System.out.println(patrimonio.validarEstadoConservacao());

		Bem bem = new Bem ();
		System.out.println(bem.getEmpresaVinculada());

		Empresa empresa1 = new Empresa();
		bem.setEmpresa(empresa1);
		System.out.println(bem.getEmpresaVinculada());

		empresa1.setNome("SENAI");
		System.out.println(bem.getEmpresaVinculada());
		System.out.println("text do bloco");
        Bloco bloco = new Bloco();
		System.out.println(bloco.getEmpresaVinculada());

		System.out.println("texte funcionario");


		Funcionario funcionario1 = new Funcionario();
		System.out.println(funcionario1.getEmpresaVinculada());

		funcionario1.setEmpresa(empresa1);
		System.out.println(funcionario1.getEmpresaVinculada());

		System.out.println("test sala");

		Sala sala1 = new Sala();
		System.out.println(sala1.getEmpresaVinculada());

		sala1.setEmpresa(empresa1);
		System.out.println(sala1.getEmpresaVinculada());

		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Joãosinho");
		pessoa.setCpf("12345667");
		System.out.println(pessoa.getIdentificacao());

		funcionario1.setNome("Mariasinha");
		funcionario1.setCpf("1234567");
		funcionario1.setCargo(Cargo.DIRETOR);
		System.out.println(funcionario1.getIdentificacao());

		System.out.println("textando atividades");
		Equipamento equipamento = new Equipamento("mesa" , 6000 );
        Equipamento computador = new Computador("notbook", 5000);
		Equipamento veiculo = new Veiculo("sandero", 1000);

		exibirRelatorio(equipamento);
		exibirRelatorio(computador);
		exibirRelatorio(veiculo);

	}
	public static void exibirRelatorio(Equipamento item){
		System.out.println("item " + item.getNome());
		System.out.println("valor inicial " + item.getValorInicial());
		System.out.println("depreciação " + item.calcularDepreciacao());
		System.out.println("--------------------------");
	}

}
