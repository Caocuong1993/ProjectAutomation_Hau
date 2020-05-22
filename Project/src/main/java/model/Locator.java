package model;

public class Locator {
	private String locator;
	private LocatorType type;

	public String getLocator() {
		return locator;
	}

	public void setLocator(String locator) {
		this.locator = locator;
	}

	public LocatorType getType() {
		return type;
	}

	public void setType(LocatorType type) {
		this.type = type;
	}

	public Locator(String locator, LocatorType type) {
		super();
		this.locator = locator;
		this.type = type;
	}

	public Locator add(Locator other) {
		return new Locator(this.locator + other.locator, this.type);
	}

	public Locator addParams(Object... params) {
		Locator locator = new Locator(this.locator, this.type);
		locator.setLocator(String.format(locator.getLocator(), params));
		return locator;
	}

	public Locator addParent(Locator parent) {
		if (parent == null) {
			return this;
		}
		return new Locator(parent.locator + this.locator, this.type);
	}
}
