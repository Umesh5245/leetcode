class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
           int maxvalue=0;
                List<Boolean> bool = new ArrayList<Boolean>();

        for(int i=0;i<candies.length;i++){
            if(candies[i]>=maxvalue) maxvalue=candies[i];
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=maxvalue)
            {
bool.add(true);
            }
            else
                bool.add(false);
        }
        return bool;
        
    }
}