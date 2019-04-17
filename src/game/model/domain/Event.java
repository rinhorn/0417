package game.model.domain;

public class Event {
	private int event_id;
	private int discount;
	private String event_name, event_icon, event_img;

	public int getEvent_id() {
		return event_id;
	}

	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getEvent_icon() {
		return event_icon;
	}

	public void setEvent_icon(String event_icon) {
		this.event_icon = event_icon;
	}

	public String getEvent_img() {
		return event_img;
	}

	public void setEvent_img(String event_img) {
		this.event_img = event_img;
	}
}