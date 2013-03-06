package org;

// TODO: Auto-generated Javadoc
/**
 * The Class MenuItem.
 */
public class MenuItem {

	/** The item name. */
	private String itemName;
	
	/** The Price. */
	private Double Price;
	
	/** The Main ingredient. */
	private String MainIngredient;
	
	/** The is heart healthy. */
	private boolean isHeartHealthy;
	
	/**
	 * Instantiates a new menu item.
	 *
	 * @param itemName the item name
	 * @param price the price
	 * @param mainIngredient the main ingredient
	 */
	public MenuItem(String itemName, Double price, String mainIngredient) {
		super();
		this.itemName = itemName;
		Price = price;
		MainIngredient = mainIngredient;
		this.isHeartHealthy=false;
	}

	
	/**
	 * Instantiates a new menu item.
	 *
	 * @param itemName the item name
	 * @param price the price
	 * @param mainIngredient the main ingredient
	 * @param isHeartHealthy the is heart healthy
	 */
	public MenuItem(String itemName, Double price, String mainIngredient,
			boolean isHeartHealthy) {
		super();
		this.itemName = itemName;
		Price = price;
		MainIngredient = mainIngredient;
		this.isHeartHealthy = isHeartHealthy;
	}


	/**
	 * Gets the item name.
	 *
	 * @return the item name
	 */
	public String getItemName() {
		return itemName;
	}
	
	/**
	 * Sets the item name.
	 *
	 * @param itemName the new item name
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public Double getPrice() {
		return Price;
	}
	
	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(Double price) {
		Price = price;
	}
	
	
	/**
	 * Checks if is heart healthy.
	 *
	 * @return true, if is heart healthy
	 */
	public boolean isHeartHealthy() {
		return isHeartHealthy;
	}


	/**
	 * Sets the heart healthy.
	 *
	 * @param isHeartHealthy the new heart healthy
	 */
	public void setHeartHealthy(boolean isHeartHealthy) {
		this.isHeartHealthy = isHeartHealthy;
	}


	/**
	 * Gets the main ingredient.
	 *
	 * @return the main ingredient
	 */
	public String getMainIngredient() {
		return MainIngredient;
	}
	
	/**
	 * Sets the main ingredient.
	 *
	 * @param mainIngredient the new main ingredient
	 */
	public void setMainIngredient(String mainIngredient) {
		MainIngredient = mainIngredient;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((MainIngredient == null) ? 0 : MainIngredient.hashCode());
		result = prime * result + ((Price == null) ? 0 : Price.hashCode());
		result = prime * result
				+ ((itemName == null) ? 0 : itemName.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuItem other = (MenuItem) obj;
		if (MainIngredient == null) {
			if (other.MainIngredient != null)
				return false;
		} else if (!MainIngredient.equals(other.MainIngredient))
			return false;
		if (Price == null) {
			if (other.Price != null)
				return false;
		} else if (!Price.equals(other.Price))
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "" + itemName + ", " + Price+ ", " + MainIngredient + "";
	}

}
