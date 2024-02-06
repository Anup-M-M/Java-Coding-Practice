package org.example.array;

// find the frequency of each element in the array.

// frequency is count the occurrence of its each element
public class FrequencyOfElements {

    public static void main(String[] args) {

        int[] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] frq = new int[arr.length];
        int visited = -1;

        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j< arr.length; j++){
                if ((arr[i] == arr[j]) && (frq[i] != -1)) {
                    count++;
                    //To avoid counting same element again
                    frq[j] = visited;
                }
            }
            if(frq[i] != visited)
                frq[i] = count;
        }

        System.out.println("Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < frq.length; i++){
            if(frq[i] != visited)
                System.out.println("      " + arr[i] + " | " + frq[i]);
        }

    }
}
