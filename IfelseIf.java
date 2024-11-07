public class IfelseIf {
    public static void main(String[] args) {
        int day = 2;
        int time = 21;
        if(day ==1){
            System.out.println("Go to home");
        } else if( day ==2){
            System.out.println("Go to village");
        }
        else if( day ==3){
            System.out.println("Go to party");

        }
        else {
            System.out.println("Go to office");
        }

        // logical operators
        if ( time >= 10 && time <=20){
            System.out.println("office is open");
        }else {
            System.out.println("Office is closed");
        }
    }
}
