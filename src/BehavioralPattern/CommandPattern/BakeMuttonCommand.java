package BehavioralPattern.CommandPattern;

/*
 * 具体命令类：烤羊肉串命令
 */
public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void excuteCommand() {
		receiver.bakeMutton();
	}

}
