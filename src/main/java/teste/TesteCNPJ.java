package teste;

import org.junit.Assert;
import org.junit.Test;

import utils.CPFCNPJUtils;

public class TesteCNPJ {

	@Test
	public void testaCNPJValido() {
		Assert.assertTrue(CPFCNPJUtils.isCNPJValido("11.222.333/0001-81"));
		Assert.assertTrue(CPFCNPJUtils.isCNPJValido("12.895.132/0001-08"));
		Assert.assertTrue(CPFCNPJUtils.isCNPJValido("37.692.624/0001-27"));
		Assert.assertTrue(CPFCNPJUtils.isCNPJValido("03.640.466/0001-40"));
		Assert.assertTrue(CPFCNPJUtils.isCNPJValido("86.789.526/0001-18"));
		Assert.assertTrue(CPFCNPJUtils.isCNPJValido("35.525.768/0001-63"));
		Assert.assertTrue(CPFCNPJUtils.isCNPJValido("35.525.768/0001-63"));
		Assert.assertTrue(CPFCNPJUtils.isCNPJValido("04.582.854/0001-84"));
		Assert.assertTrue(CPFCNPJUtils.isCNPJValido("27.550.723/0001-10"));
		Assert.assertTrue(CPFCNPJUtils.isCNPJValido("74.275.372/0001-67"));
		Assert.assertTrue(CPFCNPJUtils.isCNPJValido("63.654.524/0001-16"));
		Assert.assertTrue(CPFCNPJUtils.isCNPJValido("62.430.182/0001-98"));
		Assert.assertTrue(CPFCNPJUtils.isCNPJValido("87.616.587/0001-46"));
	}
	
	@Test
	public void geraETestaCNPJ() {
		for(int i = 0; i < 1000; i++) {
			String CNPJ = CPFCNPJUtils.gerarCNPJAleatorio(false);
			System.out.println("CNPJ sem pontuação " + CNPJ);
			Assert.assertTrue(CPFCNPJUtils.isCNPJValido(CNPJ));
			
			String CNPJ2 = CPFCNPJUtils.gerarCNPJAleatorio(true);
			System.out.println("CNPJ com pontuação " + CNPJ2);
			Assert.assertTrue(CPFCNPJUtils.isCNPJValido(CNPJ2));
		}
	}
}
