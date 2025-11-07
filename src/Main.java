import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] originalArray = {2,5,9,23,50,99,76,89,33,40};
        System.out.println("This is the original unsorted originalArray: " + Arrays.toString(originalArray));

        int splitPoint = 4;

//        int[] firstArray = Arrays.copyOfRange(originalArray, 0, splitPoint);
//        int[] secondArray = Arrays.copyOfRange(originalArray, splitPoint, originalArray.length);

        int[] firstArray = new int[originalArray.length];
        int[] secondArray = new int[originalArray.length];

        int count = 0;

        for  (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] < originalArray[splitPoint]) {
                firstArray[i] = originalArray[i];
            }
            else{
                secondArray[count] = originalArray[i];
                count++;
            }
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == 0) {
                int[] newFirstArray = new int[firstArray.length - 1];
            }
        }

        System.out.println("This is the unsorted firstArray: " + Arrays.toString(firstArray));
        System.out.println("This is the unsorted secondArray: " + Arrays.toString(secondArray));

    }

    public void ArraySort(int[] array, int [] firstArray, int [] secondArray, int splitPoint) {
        if (array.length == 0){
            System.out.println("Array is empty");
        }
        else if (array.length == 1){
            System.out.println("Array is only single element");
        }
        else {

        }
    }

}