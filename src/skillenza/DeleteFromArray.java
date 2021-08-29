package skillenza;

import java.util.Scanner;

public class DeleteFromArray {

    public static void main(String[] args) {

        int arr[] = {1,5,6,4,3,9,10};
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());

        for (int i=0; i< arr.length; i++) {
            if (arr[i] == x) {
                for (int j = i+1; j< arr.length; j++) {
                    arr[i] = arr[i+1];
                    i++;
                }
                arr[arr.length -1] = 0;
            }
        }
        x = 0;
        while (arr[x] != 0) {
            System.out.print(arr[x++] + " ");
        }
    }
}
