class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(Character.isLetter(ch) || Character.isDigit(ch))
            {
                sb.append(ch);
            }
        }
        String str = sb.toString();
        int left = 0;
        int right = str.length()-1;
        System.out.println(str);
        while(left < right)
        {
            char ch1 =  Character.toLowerCase(str.charAt(left));
            char ch2 = Character.toLowerCase(str.charAt(right));
            if(ch1 != ch2)
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}
