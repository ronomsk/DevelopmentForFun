import java.util.Scanner;
class DamnGenerator {
	public static void main(String[] args) {
		String[] words = {"гребаный", "масленок", "сукен", "лулёный", "залетный", "биборан", "сатрап", "содоммит", "харош мрась", "лалка", "сасамба", "мухех", "хехех", "сюк", "ат цюк", "тойщимта", "кек", "рестлесс эн вайлд", "в жёпу это говно", "говно из жопы", "гомосек", "хуммский"};
		
		//ArrayList<String> words = {"гребаный", "масленок", "сукен", "лулёный", "залетный", "биборан", "сатрап", "содоммит", "харош мрась", "лалка", "сасамба", "мухех", "хехех", "сюк", "ат цюк", "тойщимта", "кек", "рестлесс эн вайлд", "в жёпу это говно", "говно из жопы", "гомосек", "хуммский"};
		
		int arraylength = words.length;
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Please enter number of words - any from 1 to 22");
		int a = in.nextInt();
		System.out.println("you number is " + a);
		System.out.println("And so that phrase is created:");
		
		for(int i=0;i < a-1; i++) {
			int rand = (int) (Math.random() * arraylength);
			
			System.out.print(words[rand] + ", ");
		}
		int rand = (int) (Math.random() * arraylength);
		System.out.print(words[rand]);
	}
}
