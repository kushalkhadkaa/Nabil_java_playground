public class sumofarrayelements {
    public static void main(String args[]){
        int[] numbers={3,4,5,6,7,8,6,6,5,4,3,3,33,3};
        int sum =0;
        for(int number:numbers){
            sum+=number;
        }
        System.out.println(sum);
    }
}
