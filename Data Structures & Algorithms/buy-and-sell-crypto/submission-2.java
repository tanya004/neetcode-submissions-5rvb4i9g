class Solution{
    public int maxProfit(int [] prices){
        int minPrice = Integer.MAX_VALUE;
        int mProfit = 0;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            else{
                mProfit = Math.max(mProfit, price-minPrice);
            }
        }
        return mProfit;
    }
}