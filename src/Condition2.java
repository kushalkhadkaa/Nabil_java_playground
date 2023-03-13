public class Condition2 {

    public static void main(String args[]){
        String address ="Kathmandu,Nepal";
        if(address.endsWith("kathmandu")){
            if (address.contains("Nepal")){
                System.out.println("you are living at kathmandu nepal");
            }
        }else if (address.contains("Kathmandu")){
            System.out.println("You are living Kathmandu");
        }
        System.out.println("hello nabil bank");
    }
}
