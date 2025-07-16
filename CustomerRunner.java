public class CustomerRunner {
    public static void main(String[] args) {
		System.out.println("main started");
        Vegetable vegetable = new Vegetable("Tomato", 20.0, 100);  
        int quantity = 5;

        double price = vegetable.getPrice();
		System.out.println("main ended");
		
        System.out.println("Total price is: " + price);
    }
}





