	public class Split {
		public static String splitPart1(String input) {
		String ingredients = "";
		int bread1 = input.indexOf("bread");
		String noBread1 = input.substring(bread1 + 5, input.length());
		int bread2 = noBread1.indexOf("bread");
		ingredients += noBread1.substring(0, bread2);
		return ingredients;
	}
		public static String splitPart2(String input) {
			String ingredient = "";
			String newIngredient = "";
			String[] strArr = input.split(" ", 0);
			for(String a : strArr) {
				ingredient += a;
			}
			newIngredient = Split.splitPart1(ingredient);
			return newIngredient;
		}
	public static void main(String[] args) {
		System.out.println(Split.splitPart2("apples pineapples bread lettuce tomato bacon mayo ham bread cheese"));
	}
}