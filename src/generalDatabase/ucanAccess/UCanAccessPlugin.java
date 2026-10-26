package generalDatabase.ucanAccess;

import generalDatabase.DBControl;
import generalDatabase.DBSystem;
import generalDatabase.plugins.DBPluginInterface;

public class UCanAccessPlugin implements DBPluginInterface {

	public static final String ucName = "UCanAccess Database";
	
	private String jarFile;
	
	@Override
	public String getDefaultName() {
		return ucName;
	}

	@Override
	public String getHelpSetName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setJarFile(String jarFile) {
		this.jarFile = jarFile;
	}

	@Override
	public String getJarFile() {
		return jarFile;
	}

	@Override
	public String getDeveloperName() {
		return "Doug Gillespie";
	}

	@Override
	public String getContactEmail() {
		return "pamguard@pamguard.org";
	}

	@Override
	public String getVersion() {
		return "1,0";
	}

	@Override
	public String getPamVerDevelopedOn() {
		return "2.03.00";
	}

	@Override
	public String getPamVerTestedOn() {
		return "2.03.00";
	}

	@Override
	public String getAboutText() {
		return "Interface to the UCanAccess database bridge to Microsoft Access databases";
	}

	@Override
	public DBSystem getDatabaseSystem(DBControl dbControl, int settingsStore) {
		return new UCanAccessSystem(dbControl, settingsStore);
	}

}
