package BehavioralPattern.CommandPattern;

/*
 * 具体命令类：烤鸡翅命令
 */
public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void excuteCommand() {
		receiver.bakeChickenWing();
	}

}
