public class WeightOfHill{
    public static void main(String[] args) {
        int height = 4,wt_of_level1=1,incr=5;
        int s=0;
        for(int i=0;i<height;i++){
          s=s+(wt_of_level1+(incr*i))*(i+1);
        }
        System.out.println(s);
    }
}