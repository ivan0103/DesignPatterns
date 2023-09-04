package com.company;

//This enum represents the aggregate from iterator pattern
public enum ThemeColor {

	RED,
	ORANGE,
	BLACK,
	WHITE;

	public static Iterator<ThemeColor> getIterator() {
		return new ThemeColorIterator();

	}
	private static class ThemeColorIterator implements Iterator<ThemeColor> {
		private int pos;

		@Override
		public boolean hasNext() {
			return pos < ThemeColor.values().length;
		}

		@Override
		public ThemeColor next() {
			return ThemeColor.values()[pos++];
		}
	}
}

