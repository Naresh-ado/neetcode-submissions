class Solution {
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums)
        {
            set.add(x);
        }
        int max = 0;
        for(int x : set)
        {
            int count = 0;
            int curr = x;
            if(!set.contains(curr-1))
            {
                while(set.contains(curr))
                {
                    count++;
                    curr++;
                }
            }
            if(count > max)
            {
                max = count;
            }
        }

        return max;
        
    }
}
