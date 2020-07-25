package brokerDealer.util;

import java.util.Properties;

import br.com.caelum.stella.format.CPFFormatter;

public class	PropertiesUtils implements PropertiesUtilsInterface {
	
	private		Properties		aProperties;
	
	public PropertiesUtils() {
		this.aProperties	=	FilesFoldersUtil.loadProperties();
	}
	
	@Override
	public String getCPF() {
		return (String) this.aProperties.get("cpf");
	}
	
	public String getFormatedCPF() {
		String			unformatedCPF	=	(String) this.aProperties.get("cpf");
		
		CPFFormatter	cpfFormatter	=	new		CPFFormatter();
		String			formatedCPF		=	cpfFormatter.format(unformatedCPF);
		
		return			formatedCPF; 
	}

	@Override
	public String getPassword() {
		return (String) this.aProperties.get("password");
	}

	@Override
	public String getBirthdate() {
		return (String) this.aProperties.get("birthDay");
	}

	@Override
	public boolean isPropertiesLoaded() {
		boolean		response	=	false;
		if ( this.aProperties	!= null		&&		!this.aProperties.isEmpty() ) {
					response	=	true;
		}
		
		return response;
	}
	
}