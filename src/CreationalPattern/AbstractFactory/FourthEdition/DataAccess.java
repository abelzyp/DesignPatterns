package CreationalPattern.AbstractFactory.FourthEdition;

public class DataAccess {
	private static final String DB = "Sqlserver";
	// private static final String DB = "Access";

	public static IUser createUser() {
		IUser user = null;
		switch (DB) {
		case "Sqlserver":
			user = new SqlserverUser();
			break;
		case "Access":
			user = new AccessUser();
			break;
		}
		return user;
	}

	public static IDepartment createDepartment() {
		IDepartment department = null;
		switch (DB) {
		case "Sqlserver":
			department = new SqlserverDepartment();
			break;
		case "Access":
			department = new AccessDepartment();
			break;
		}
		return department;
	}
}
