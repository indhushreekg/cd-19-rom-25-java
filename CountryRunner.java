
public class CountryRunner {
    public static void main(String[] args) {
		String CountryName = "srilanka";
        int CountryCode = Country.getCountryCode(CountryName);
        System.out.println("Country Code for" +CountryName+ "is:"+CountryCode);
    }
}
