class Solution {
    public int removeDuplicates(int[] nums) {

        int[] arr = {1, 1, 2};

        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);

        return set.size();
    }
}