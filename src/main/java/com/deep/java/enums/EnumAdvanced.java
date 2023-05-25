package com.deep.java.enums;

public class EnumAdvanced {

	// Enum with a variable,method and constructor
	enum SeasonCustomized {
		WINTER(1), SPRING(2), SUMMER(3), FALL(4);

		// variable
		private int code;

		// method
		public int getCode() {
			return code;
		}

		// Constructor-only private or (default)
		// modifiers are allowed (public , private ..)
		SeasonCustomized(int code ) {
			this.code = code;
		}

		// Getting value of enum from code
		public static SeasonCustomized valueOf(int code) {
			for (SeasonCustomized season : SeasonCustomized.values()) {
				if (season.getCode() == code)
					return season;
			}
			throw new RuntimeException("value not found");// Just for kicks
		}

		// Enum switch statement  Sample
		public int getExpectedMaxTemperature() {
			switch (this) {
			case WINTER:
				return 5;
			case SPRING:
			case FALL:
				return 10;
			case SUMMER:
				return 20;
			}
			return -1;// Dummy since Java does not recognize this is possible :)
		}

	};

	public static void main(String[] args) {
		SeasonCustomized season= SeasonCustomized.WINTER;

		//compiler error
		// SeasonCustomized season= SeasonCustomized(1);
		System.out.println(season.getCode());
		System.out.println(season.getExpectedMaxTemperature());
		System.out.println(SeasonCustomized.valueOf(4));
	}


}