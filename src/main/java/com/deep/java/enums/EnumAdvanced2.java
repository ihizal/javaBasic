package com.deep.java.enums;

public class EnumAdvanced2 {

	// Enum with a variable,method and constructor
	enum SeasonCustomized {
		WINTER(1) {
			public int getExpectedMaxTemperature() {
				return 5;
			}
		},
		SPRING(2), SUMMER(3) {
			public int getExpectedMaxTemperature() {
				return 20;
			}
		},
		FALL(4);

		// variable
		private int code;

		// method
		public int getCode() {
			return code;
		}

		// Constructor-only private or (default)
		// modifiers are allowed
		SeasonCustomized(int code) {
			this.code = code;
		}

		public int getExpectedMaxTemperature() {
			return 10;
		}

	};

	public static void main(String[] args) {
		SeasonCustomized seasonCustomized = SeasonCustomized.WINTER;

		SeasonCustomized sspring = SeasonCustomized.SUMMER;

		System.out.println(sspring.getExpectedMaxTemperature());

		System.out.println(seasonCustomized.getExpectedMaxTemperature());

		System.out.println(seasonCustomized.FALL.getExpectedMaxTemperature());
	}

}