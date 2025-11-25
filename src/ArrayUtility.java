
public class ArrayUtility {

    public static void print(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ',');
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double newAvg = (double) sum / array.length;
        double newDouble = ((int)(newAvg * 100)) / 100.0;
        return newDouble;

    }

    public static int minimum(int[] array) {
        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] <= min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] >= max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int counter = 0;
        for(int i: array){
            if(i % 2 == 0){
                counter++;
            }
        }
        return counter;
    }

    public static int[] reverseOne(int[] array) {
        int[] newArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - i - 1];
        }
        return newArray;
    }

    public static void reverseTwo(int[] array) {
        for(int i = 0; i < array.length / 2; i++) {
            int a = array[i];
            int b = array[array.length - i - 1];
            array[i] = b;
            array[array.length - i - 1] = a;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
       for(int i = 0; i < array.length; i++) {
           if(array[i].equals(str)){
               return true;
           }
       }
       return false;
    }

    public static void multiplyByTwo(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for(int i = 0; i < array.length; i++) {
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
        String str = "";
        for(int i = 0; i < array.length - 1; i++) {
            str += array[i] + ", ";
        }
        str += array[array.length - 1];
        return str;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }

        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int last = array[array.length - 1];
        for(int i = array.length - 1; i > 0; i--){
            array[i] = array[i - 1];
        }
        array[0] = last;
    }

    public static void shiftLeft(int[] array) {
        int first = array[0];
        for(int i = 1; i < array.length; i++){
            array[i - 1] = array[i];
        }
        array[array.length - 1] = first;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for(int i = 1; i <= n; i++){
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for(int i = 1; i <= n; i++){
            shiftLeft(array);
        }

    }


}
