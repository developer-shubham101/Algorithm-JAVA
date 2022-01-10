public class ArrayAlgo {
    public void performOperation() {
        int[] array1 = {2, 144, 32, 53, 243, 22};
        int[] array2 = {43, 53, 66, 54, 64, 75, 42, 3};

        int totalLength = (array2.length + array1.length);
        int[] array3 = new int[totalLength];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = array1.length; i < totalLength; i++) {
            array3[i] = array2[i - array1.length];
        }


        for (int i = 1; i <= array3.length; i++) {
            if (array3[i] > array3[i - 1]) {

            }

        }


        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
