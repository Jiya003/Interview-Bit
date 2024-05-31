/*
Given an array of size N, find the majority element. The majority element is the element that appears more than floor(N/2) times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/
public class MajorityElement {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        int candidate = 0;
        int count = 0;

        // Finding the majority element candidate
        for (int num : A) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;         
    }
}

