package teste;

import org.junit.Assert;
import org.junit.Test;

import utils.CPFCNPJUtils;

public class TesteCPF {
	
	@Test
	public void testaCPFValido() {
		Assert.assertTrue(CPFCNPJUtils.isCPFValido("16363948096"));
		Assert.assertTrue(CPFCNPJUtils.isCPFValido("13861536056"));
		Assert.assertTrue(CPFCNPJUtils.isCPFValido("74681086096"));
		Assert.assertTrue(CPFCNPJUtils.isCPFValido("62520031077"));
		Assert.assertTrue(CPFCNPJUtils.isCPFValido("09947914020"));
		Assert.assertTrue(CPFCNPJUtils.isCPFValido("554.424.249-60"));
		Assert.assertTrue(CPFCNPJUtils.isCPFValido("222.286.907-24"));
		Assert.assertTrue(CPFCNPJUtils.isCPFValido("522.879.462-09"));
		Assert.assertTrue(CPFCNPJUtils.isCPFValido("145.731.892-03"));
		Assert.assertTrue(CPFCNPJUtils.isCPFValido("145.731.892-03"));
		Assert.assertTrue(CPFCNPJUtils.isCPFValido("785.736.315-46"));
	}
	
	@Test
	public void geraETestaCPF() {
		for(int i = 0; i < 1000; i++) {
			String cpf = CPFCNPJUtils.gerarCPFAleatorio(false);
			System.out.println("CPF sem pontuação " + cpf);
			Assert.assertTrue(CPFCNPJUtils.isCPFValido(cpf));
			
			String cpf2 = CPFCNPJUtils.gerarCPFAleatorio(true);
			System.out.println("CPF com pontuação " + cpf2);
			Assert.assertTrue(CPFCNPJUtils.isCPFValido(cpf2));
		}
	}
}