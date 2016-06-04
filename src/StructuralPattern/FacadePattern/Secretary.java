package StructuralPattern.FacadePattern;

/*
 * 外观角色，秘书
 */
public class Secretary {
	private Restaurant restaurant = new Restaurant();
	private Hotel hotel = new Hotel();

	// 安排饭局
	public void bookEat(int num) {
		restaurant.reserve(num);
	}

	// 安排酒店
	public void bookSleep(int days) {
		hotel.reserve(days);
	}
}
