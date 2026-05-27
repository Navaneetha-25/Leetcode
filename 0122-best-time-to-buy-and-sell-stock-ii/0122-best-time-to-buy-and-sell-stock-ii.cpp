class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int cur=0,profit=0,minPrice=INT_MAX;
        for(int p:prices){
            if(minPrice!=INT_MAX){
                cur=max(0,p-minPrice);
                profit+=cur;
            }
            minPrice=min(minPrice,p);
            if(cur>0){
                minPrice=p;
                cur=0;
            }
        }
        return profit;
    }
};