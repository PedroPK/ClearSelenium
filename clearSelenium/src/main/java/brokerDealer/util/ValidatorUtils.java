package brokerDealer.util;

import br.com.caelum.stella.validation.CPFValidator;

public class ValidatorUtils implements ValidatorUtilsInterface {

	@Override
	public boolean isValidCPF(String	pCPF) {
		CPFValidator cpfValidator = new CPFValidator();
		
		boolean response = cpfValidator.isEligible(pCPF);
		
		return response;
	}

	@Override
	public boolean isValidCPF(String	pCPF,	boolean pIsFormated) {
		// TODO Auto-generated method stub
		return false;
	}

}
