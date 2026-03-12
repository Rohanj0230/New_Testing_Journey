package New_Testing_Journey.New_Testing_Journey;

import org.apache.commons.lang3.RandomStringUtils;

public class Demo {

	public String d1() {

		String s1 = RandomStringUtils.randomAlphabetic(5);
		return s1;
	}

	public static String[][] datapo() {

		String[][] d1 = { { "ROhan", "Jadhav" }, { "Akshay", "Bankar" } };

		return d1;
	}

	public static String d2() {
		String s = "Rakesh";
		return s;
	}

	public static void main(String[] args) {

		String[][] data = datapo();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

	}

}
