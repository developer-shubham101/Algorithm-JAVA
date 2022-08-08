import java.util.ArrayList;
import java.util.List;

public class StringOperation {
    public void performOperation() {
        String sample = "12345678";
        ///123-456-789
        ///123-456-78-90
        ///000-123-456-78-90


        int remains = sample.length() % 3;

        if (remains == 1) {

            String end = sample.substring(sample.length() - 4);
            String first = sample.substring(0, sample.length() - 4);

            String[] array = first.split("(?<=\\G.{3})");
            StringBuilder newString = new StringBuilder();
            for (String s : array) {
                newString.append(s);
                newString.append("-");
            }

            String[] array2 = end.split("(?<=\\G.{2})");
            for (int i = 0; i < array2.length; i++) {
                newString.append(array2[i]);
                if (i != array2.length - 1) {
                    newString.append("-");
                }
            }
            System.out.println(newString);
        } else {
            String[] array = sample.split("(?<=\\G.{3})");
            StringBuilder newString = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                newString.append(array[i]);
                if (i != array.length - 1) {
                    newString.append("-");
                }
            }
            System.out.println(newString);
        }

    }
}
