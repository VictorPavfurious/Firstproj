package twoPackage.com;

import java.io.IOException;
import java.util.Scanner;

public class Find {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int arr [] = new int [5];

        int first = 0 , second = 0;
        for(int i = 0;i < arr.length;i++)
        {
            arr[i] = sc.nextInt();

        }
        int min = arr[0];

        int min2;
        for(int j = 0; j < arr.length;j++)
        {
            if(arr[j] < min) {
                min = arr[j];
                first = j;
            }

        }
        if (first==0) {
            min2 = arr[1] + 1;
        }


        else {
            min2 = arr[0] + 1;
        }

        for(int k = 0 ; k < arr.length; k++)
        {
            if(arr[k] < min2 && arr[k] > min)
            {
                min2 = arr[k];
                second = k;
            }
        }
        System.out.println(min + " " + min2 + " The distance : " + Math.abs(first - second));

    }
}
