package Algorithms;

// FREEZE CODE BEGIN
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import reader.Reader;

public class SingleSort {
    // FREEZE CODE END

// WRITE YOUR CODE HERE
    public static void sort(String[] data) {
        int n = data.length;
        // Insertion sort
        for(int i = 1; i< n;i++){

            String account = data[i];
            int accountNumber = Integer.parseInt(account.split(",")[0]);
            int j = i - 1;

            while(j>=0 && Integer.parseInt(data[j].split(",")[0]) < accountNumber){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = account;
        }
    }


    // FREEZE CODE BEGIN
    public static void main(String[] args) throws IOException {
        String path = args[0];
        List<String> data = new ArrayList<>();
        List<String> noHeader = new ArrayList<>();

        data = Reader.readCSV(path);
        noHeader = data.subList(1, data.size());
        String[] arr = new String[noHeader.size()];
        arr = noHeader.toArray(arr);
        sort(arr);

        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);
    }
}
// FREEZE CODE END
