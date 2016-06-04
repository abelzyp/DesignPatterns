package BehavioralPattern.Mediator;

/*
 * 联合国安理会，具体中介者角色
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {
	private USA usa;
	private Iraq iraq;

	public void setUsa(USA usa) {
		this.usa = usa;
	}

	public void setIraq(Iraq iraq) {
		this.iraq = iraq;
	}

	@Override
	public void declare(String message, Country colleague) {
		if (colleague == usa) {
			iraq.getMessage(message);
		} else {
			usa.getMessage(message);
		}
	}

}
