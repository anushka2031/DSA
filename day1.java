// Day: 1
// Date: 10/03/2026
// Day: Tuesday

// Java Collections

import java.util.*;

public class day1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add
        list.add(10);
        list.add(20);
        list.add(30);
        // Update
        list.set(1, 40);
        System.out.println(list);
        // Get
        System.out.println(list.get(1));
        // Remove
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        for(int i : list) {
            System.out.println(i);
        }
        // Check value exist or not
        if(list.contains(10)){
            System.out.println("Value exist");
        }
        else{
            System.out.println("Value not exist");
        }

        // Find smallest and largest
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i : list){
            if(i < smallest){
                smallest = i;
            }
            if(i > largest){
                largest = i;
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        // Sum of elements
        int sum = 0;
        for(int i : list){
            sum += i;
        }
        System.out.println("Sum: " + sum);
        // Average of elements
        System.out.println("Average: " + (double)sum/list.size());

        // Reverse list
        for(int i=list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }

        // Count even and odd
        int evenCount = 0, oddCount = 0;
        for(int i : list){
            if(i % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);

        // Sort
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // Second largest
        int secondLargest = Integer.MIN_VALUE, largestValue = Integer.MIN_VALUE;
        for(int i : list){
            if(i > largestValue){
                secondLargest = largestValue;
                largestValue = i;
            }
            else if(i > secondLargest){
                secondLargest = i;
            }
        }
        System.out.println("Second largest: " + secondLargest);

        // Swap two elements
        int temp = list.get(0);
        list.set(0, list.get(1));
        list.set(1, temp);
        System.out.println(list);

        // Copy list
        ArrayList<Integer> list2 = new ArrayList<>(list);
        System.out.println(list2);

        // Merge list
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(40);
        list3.add(50);
        list3.add(60);
        list3.addAll(list);
        list3.addAll(list2);
        System.out.println(list3);

        // Remove duplicates
        ArrayList<Integer> list4 = new ArrayList<>();
        for(int i : list3){
            if(!list4.contains(i)){
                list4.add(i);
            }
        }
        System.out.println(list4);

        // Using hashset remove duplicates
        HashSet<Integer> set = new HashSet<>(list3);
        System.out.println(set);

        // Find frequency of an element
        int countFreq = 0, target = 10;
        for(int i : list3){
            if(i == target){
                countFreq++;
            }
        }
        System.out.println("Frequency of " + target + " is " + countFreq);

        // Matrix
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(10);
        row1.add(20);
        row1.add(30);
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(40);
        row2.add(50);
        row2.add(60);
        matrix.add(row1);
        matrix.add(row2);
        System.out.println(matrix);

        // Matrix multiplication
        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<>();
        ArrayList<Integer> row11 = new ArrayList<>();
        row11.add(1);
        row11.add(2);
        ArrayList<Integer> row12 = new ArrayList<>();
        row12.add(1);
        row12.add(2);
        matrix1.add(row11);
        matrix1.add(row12);
        ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<>();
        ArrayList<Integer> row21 = new ArrayList<>();
        row21.add(1);
        row21.add(2);
        ArrayList<Integer> row22 = new ArrayList<>();
        row22.add(1);
        row22.add(2);
        matrix2.add(row21);
        matrix2.add(row22);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i<matrix1.size(); i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<matrix1.get(i).size(); j++){
                int currSum = 0;
                for(int k=0; k<matrix1.get(i).size(); k++){
                    currSum += matrix1.get(i).get(k) * matrix2.get(k).get(j);
                }
                row.add(currSum);
            }
            ans.add(row);
        }
        System.out.println(ans);

        // Dynamic array capacity
        // Formula: newCapacity = oldCapacity + (oldCapacity / 2)
    }
}