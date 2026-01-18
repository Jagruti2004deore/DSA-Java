//import java.util.*;

// Pairs in an Array
public class PairsArr {

    public static void printPairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];   // 2, 4, 6, 8, 10
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};

        printPairs(numbers);
    }
}


// PRINT_PAIRS(arr)
//     FOR i ← 0 TO length(arr) − 1 DO
//         current ← arr[i]

//         FOR j ← i + 1 TO length(arr) − 1 DO
//             PRINT (current, arr[j])
//         END FOR

//         PRINT new line
//     END FOR
// END
