package main.webapp;
// A simple Java Bean - To hold the details of a Burgers_R_Us Menu item - Just a Constructor and Getters & Setters for each field
//NOTE - We have overwritten the default toString method inherited from Object to provide a formatted String giving the menu details of an instance of this Class.
public class BRUSItem extends Item{


    //Constructor
	public BRUSItem(String id, String name, String price, String mealPrice, String calories, String mealCalories,String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.mealPrice = mealPrice;
		this.calories = calories;
		this.mealCalories = mealCalories;
		this.description = description;
		this.recommendations = "";
		this.options = "";
	    this.separator = "<p>--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</p>";
	}

	//NOTE - Updated toString() - Used in the main Program to print out the menu.
	@Override
	public String toString() {
		String result = "\nid: " + id + "\nName: " + name + "\nPrice: "+ price + "\nMeal Price: " + mealPrice + "\nCalories: " + calories + "\nMeal Calories: " + mealCalories + "\nDescription: " + description + "\n" + "------------------------------\n";
		return result;
	}
	//Getters & Setters
	  public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getMealPrice() {
			return mealPrice;
		}
		public void setMealPrice(String mealPrice) {
			this.mealPrice = mealPrice;
		}
		public String getCalories() {
			return calories;
		}
		public void setCalories(String calories) {
			this.calories = calories;
		}
		public String getMealCalories() {
			return mealCalories;
		}
		public void setMealCalories(String mealCalories) {
			this.mealCalories = mealCalories;
		}
		public String getRecommendations() {
			return recommendations;
		}
		public void setRecommendations(String recommendations) {
			this.recommendations=recommendations;
		}
		public String getSeparator() {
			return separator;
		}
		public void setSeparator(String separator) {
			this.separator=separator;
		}
}
