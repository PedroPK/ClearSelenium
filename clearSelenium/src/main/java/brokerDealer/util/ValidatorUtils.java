package brokerDealer.util;

import br.com.caelum.stella.validation.CPFValidator;

public class ValidatorUtils implements ValidatorUtilsInterface {

	@Override
	public boolean isValidCPF(String	pCPF) {
		boolean hasMoreThen11Characters = false;
		if ( pCPF != null && pCPF.length() > 11 ) {
			hasMoreThen11Characters = true;
		}
		
		CPFValidator cpfValidator = new CPFValidator(hasMoreThen11Characters);
		
		boolean response = cpfValidator.isEligible(pCPF);
		
		return response;
	}

	@Override
	public boolean isValidCPF(String	pCPF,	boolean pIsFormated) {
		// TODO Auto-generated method stub
		return false;
	}

}
