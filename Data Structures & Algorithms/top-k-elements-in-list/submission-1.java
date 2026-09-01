class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        //Here K represents top K  mst frequent elements 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int  x : nums)
        {
            if(map.containsKey(x))
            {
                map.put(x,map.get(x) + 1);
            }
            else
            {
                map.put(x,1);
            }
        }
        int[] arr = new int[map.size()];
        int[] freq = new int[map.size()];
        int ptr = 0;
        for(int x : map.keySet())
        {
            arr[ptr] = x;
            freq[ptr] = map.get(x);
            ptr++;
        }      

        for(int i=0;i<ptr;i++)
        {
            for(int j=i+1;j<ptr;j++)
            {
                if(freq[i] < freq[j])
                {
                    int tempf = freq[i];
                    freq[i] = freq[j];
                    freq[j] = tempf;

                    int tempa = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempa;

                }
            }
        }
        int[] ret = new int[k];
        int id = 0;
        for(int i=0;i<k;i++)
        {
            ret[i] = arr[i];
        }

        return ret;
    }
}
