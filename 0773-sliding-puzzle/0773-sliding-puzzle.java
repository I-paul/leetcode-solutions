import java.util.*;

class Solution 
{
    public String swap(String curr, int i, int j)
    {
        char[] chars=curr.toCharArray();

        char temp=chars[i];

        chars[i]=chars[j];

        chars[j]=temp;

        return new String(chars);
    }

    public int slidingPuzzle(int[][] board) 
    {
        String s="";

        for(int[] r:board)
        {
            for(int n:r)
            {
                s=s+n;
            }
        }

        String t="123450";

        Queue<String> q=new LinkedList<>();

        Set<String> set=new HashSet<>();

        int[][] neighbour={
            {1,3},
            {0,2,4},
            {1,5},
            {0,4},
            {1,3,5},
            {2,4}
        };

        q.offer(s);

        set.add(s);

        int level=0;

        while(q.isEmpty()==false)
        {
            int size=q.size();

            for(int i=0;i<size;i++)
            {
                String curr=q.poll();

                if(curr.equals(t))
                {
                    return level;
                }

                int index=curr.indexOf('0');

                for(int next:neighbour[index])
                {
                    String swapped=swap(curr,index,next);

                    if(!set.contains(swapped))
                    {
                        set.add(swapped);

                        q.offer(swapped);
                    }
                }
            }

            level++;
        }

        return -1;
    }
}