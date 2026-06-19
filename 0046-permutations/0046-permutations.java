class Solution {
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> res=new ArrayList<>();
      findPermutation(res,new ArrayList <>(),nums);
      return res;
    }
    public static void findPermutation(List<List<Integer>> list,List<Integer> temp,int[] nums){
        if(temp.size()==nums.length){
            list.add(new ArrayList<>(temp));
        }else{
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            findPermutation(list,temp,nums);
            temp.remove(temp.size()-1);
        }
        }
    }
    
}