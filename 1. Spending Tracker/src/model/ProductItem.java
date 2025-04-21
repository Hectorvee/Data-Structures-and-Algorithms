package model;

import java.io.Serializable;

public class ProductItem implements Serializable, Comparable<ProductItem>
{
	private static final long serialVersionUID =1L;
	private int id;
	private double price;
	private String name;
	private String description;
	
	public ProductItem() 
	{
		
		id = -1;
		price = -1;
		name = "";
		description = "";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String toString()
	{
		return id +"\t"+name+"\t"+description+"\t"+price;
	}
	
	
	
	@Override
	public int compareTo(ProductItem item) {
		if (price < item.price)
		{
			return -1;
		}
		else if (price > item.price)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}
