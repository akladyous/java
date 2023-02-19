package com.practice.enumeration;

public enum DayOfWeeks {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY {
		public String weekEnds() {
			return "Happy Sunday";
		}
	};

	public String weekEnds() {
		StringBuilder msg = new StringBuilder("Have a ");
		switch (this.name()) {
			case "SATURDAY" -> msg.append("good WeekEnd");
			case "SUNDAY" -> msg.append("Awesome WeekEnd");
			default -> msg.append("good ").append(this.name());
		}
		return msg.toString();
	}
}
