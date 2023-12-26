package org.example;

import java.util.*;

public class Main {
    // A salesperson must sell n items in a bag with random IDs.
    // The salesperson can remove as many as m items from the bag.
    // Determine the minimum number of different IDs the final bag
    // can contain after performing, at most, m deletions
    // A salesperson must sell n items in a bag with random IDs. The salesperson can remove as many as m items from the bag. Determine the minimum number of different IDs the final bag can contain after performing, at most, m deletions.
    //
    //Example
    //
    //n = 6
    //
    //ids = [1, 1, 1, 2, 3, 2]
    //
    //m = 2
    //
    //Two possible actions that give the minimum 2 different IDs:
    //
    //Remove 2 items with ID = 2 and the final bag will contain item ids' = [1, 1, 1, 3]
    //Remove 1 item with ID = 2 and 1 item with ID=3 and the final bag will contain item ids' = [1, 1, 1, 2]
    //The minimum number of distinct IDs is 2.
    //
    //Function Description
    //
    //Complete the function deleteProducts in the editor below.
    //
    //deleteProducts has the following parameters:
    //
    //int ids[n]: an array of integers
    //
    //int m: an integer, the maximum number of deletions
    //
    //Returns:
    //
    //int: an integer that represents the minimum number of item IDs

        /*
         * Complete the 'deleteProducts' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY ids
         *  2. INTEGER m
         */
        public static int deleteProducts(List<Integer> ids, int m) {
            // Write your code here
            Map<Integer, Integer> map = new HashMap<>();
            for (Integer id : ids) {
                if (map.containsKey(id)) {
                    map.put(id, map.get(id) + 1);
                } else {
                    map.put(id, 1);
                }
            }

            // values
            List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());

            // sorting using Comparator
            list.sort(Comparator.comparingInt(Map.Entry::getValue));

            // Creating new map after sorting and also
            // maintaining insertion order
            Map<Integer, Integer> lh = new LinkedHashMap<>();
            for (Map.Entry<Integer, Integer> e : list) {
                lh.put(e.getKey(), e.getValue());
            }

            for (Integer i : lh.keySet()) {
                // removing element from whose frequency count is
                // less than m ,Sorted manner to get minimum
                // distinct ids
                if (map.get(i) <= m) {
                    m -= map.get(i);
                    map.remove(i);
                }
            }
            return map.size();
        }
    public static void main(String[] args) {
       List<Integer> input= new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 2, 1));
        List<Integer> input2= new ArrayList<>(Arrays.asList(1, 1, 5, 5));
        System.out.println(deleteProducts(input,3));
        System.out.println(deleteProducts(input2,2));
    }
}