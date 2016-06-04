package BehavioralPattern.Mediator;

/*
 * 抽象同事角色：国家类
 */
public abstract class Country {
	protected UnitedNations mediator;

	public Country(UnitedNations mediator) {
		this.mediator = mediator;
	}

}
