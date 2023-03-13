public class ElseIf {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 30;
        int d = 40;
        if(1==2){
        if (a > b) {
            System.out.println("definately a is greater than b ");
        } else if (a==b) {
            System.out.println("both are equal");
        } else{
            System.out.println("A is less then B");
        }
    }else {
            String city="Kathmandu";
            if(city=="Biratnagar"){
                System.out.println("Orchid College");
            }else if (city=="Itahari"){
                System.out.println("Itahari International College");
            } else if (city=="Kathmandu"){
                System.out.println("LBEF");
            }
        }
    }
}
