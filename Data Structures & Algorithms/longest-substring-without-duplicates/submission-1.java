class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int[] lastseen = new int[128];
        int max = 0;
        int left = 0;
        for(int right = 0;right < s.length();right++)
        {
            char ch = s.charAt(right);
            left = Math.max(left,lastseen[ch]);
            max = Math.max(max,right - left + 1);
            lastseen[ch] = right + 1;
        }

        return max;
        /*
        HashMap<Character,Integer> window = new HashMap<>();
        int left = 0;
        int max = 0;
        for(int right = 0;right < s.length();right++)
        {
            char ch = s.charAt(right);
            window.put(ch,window.getOrDefault(ch,0) + 1);
            while(window.get(ch) > 1)
            {
                char cleft = s.charAt(left);
                window.put(cleft,window.get(cleft) - 1);
                if(window.get(cleft) == 0)
                {
                    window.remove(cleft);
                }
                left++;
            }
            if(window.size() > max)
            {
                max  = window.size();
            }

        }
        return max;*/
        
    }
}
