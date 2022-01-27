package miscellaneousPrograms;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {

		String main = "You''re a very good boy and {0} too. Also {1} and {2}";
		String str = "You''re a very good boy and {0} too.";
		String[] skills = {"sincere","hardworking","intelligent"};
		
		System.out.println(MessageFormat.format(main,skills));
		
		for (String s : skills) {
			String output = MessageFormat.format(str, s);
			System.out.println(output);
		}
		
	}

}
