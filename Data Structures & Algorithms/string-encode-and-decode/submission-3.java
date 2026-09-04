class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String x : strs)
        {
            sb.append(x.length());
            sb.append("#");
            sb.append(x);
            
        }
        //System.out.println(s);

        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i<str.length())
        {

            int j  = i;
            while(str.charAt(j) != '#')
            {
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            list.add(str.substring(j+1,j+1+len));
            i = j+1+len;
        }
        
        return list;

        /*
        Suppose:

3#cat5#hello

Let's put indexes:

 0 1 2 3 4 5 6 7 8 9 10 11
 3 # c a t 5 # h e l  l  o
   ↑
   j

Here:

j = 1
len = 3
so we are using j+1+len to get the next encoded string */

    }
}
