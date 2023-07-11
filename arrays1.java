public class arrays1 {
    public int[] TwoSum(int [] num,int target){
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length-1;j++ ){
                if(num[i]+num[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("Could not find");
    }
    public static void main(String[] args) {
        arrays1 TwoSum=new arrays1();
        int [] num={1,5,6,4,7,8,9};
        int target=9;
        int[] result=TwoSum.TwoSum(num,target);
        System.out.println(result[0]+" "+result[1]);
        
    }
}
