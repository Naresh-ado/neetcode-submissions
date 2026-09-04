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

    }
}
