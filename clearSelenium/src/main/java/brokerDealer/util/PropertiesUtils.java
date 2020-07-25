package brokerDealer.util;

import java.io.File;
import java.util.Properties;

public class	PropertiesUtils implements PropertiesUtilsInterface {
	
	private		Properties		aProperties;
	
	public PropertiesUtils() {
		this.aProperties	=	FilesFoldersUtil.loadProperties();
	}
	
	@Override
	public String getCPF() {
		return (String) this.aProperties.get("cpf");
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