package br.com.gestaoe;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.com.gestaoe.produto.ControleDeEstoque;
import br.com.gestaoe.produto.ControleDeEstoqueDTO;
import br.com.gestaoe.produto.ProdutoDto;
import br.com.gestaoe.produto.ProdutoRepository;

@SpringBootApplication
@EnableWebMvc
@EnableJpaRepositories
@Configuration
public class GestaoEApplication implements WebMvcConfigurer, CommandLineRunner {

	@Autowired
	private ProdutoRepository repository;
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
	}
	
    public static void main(String[] args) {
        SpringApplication.run(GestaoEApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("Ola");
		
		List<ControleDeEstoqueDTO> list1 = repository.findByProdutoDescricaoSQL(null);
	
		List<ControleDeEstoqueDTO> result1 = list1.stream().map(x -> new ControleDeEstoqueDTO()).collect(Collectors.toList());
		
		
		for (ControleDeEstoqueDTO obj: result1) {
			
			//System.out.println(obj.getData());
			System.out.println(obj.getId());
			System.out.println(obj.getDescricao());
			//System.out.println(obj.getEntradaQuantidade());
			//System.out.println(obj.getEntradaValorUnit());
			//ystem.out.println(obj.getEntradaValorTotal());
			//System.out.println(obj.getSaidaQuantidade());
			//System.out.println(obj.getSaidaValorUnit());
			//System.out.println(obj.getSaidaValorTotal());
			//System.out.println(obj.getSaldoQuantidade());
			//System.out.println(obj.getSaldoValorUnit());
			//System.out.println(obj.getSaldoValorTotal());
		}
	}
    

}
