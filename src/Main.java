public class Main {
    public static void main(String[] args) {


    //task 1
    int[] intArray = new int[3];
    intArray[0] = 1;
    intArray[1] = 2;
    intArray[2] = 3;
    double[] doubleArray = {1.57, 7.654, 9.986};
    String[] stringArray = new String[]{" Hello ", " World ", " Java "};
        System.out.println(" Целочисленный массив: ");
        for (int num : intArray) {
        System.out.print(num + " ");
    }
        System.out.println("\n Дробный массив: ");
        for (double num : doubleArray) {
        System.out.print(num + " ");
    }
        System.out.println("\n Строковый массив: ");
        for (String str : stringArray) {
        System.out.print(str + " ");
    }

    // task 2
    double[] doubleArray = {1.57, 7.654, 9.986};
        System.out.print("Массив дробных чисел: ");
        for (int i = 0; i < doubleArray.length; i++) {
        System.out.print(doubleArray[i]);
        if (i < doubleArray.length - 1) ;
        }
    // task 3
        int[] numbers = {1, 2, 3};
        double[] decimals = {1.57, 7.654, 9.986};
        String[] thirdArray = {"A", "B", "C"};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        for (int i = decimals.length - 1; i >= 0; i--) {
            System.out.print(", " + decimals[i]);
        }
        for (int i = thirdArray.length - 1; i >= 0; i--) {
            System.out.print(", " + thirdArray[i]);
        }

        System.out.println();
        }
    // task 4
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
        System.out.print("Преобразованный массив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

