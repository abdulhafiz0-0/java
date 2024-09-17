package student;

public class Homework1 {

    public double shippingCalculator(int n){
        if (n == 0) {
            return 0;
        }else if (n == 1) {
            return 1;
        }else{
            return ((n-1)*2.95) + 10.95;
        }
    }
    public boolean isValidTriangle(int a, int b, int c){
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            return false;
        }
        return true;
    }
    public boolean isPrime(int number){
        int counter = 0;
        if (number == 2) {
            return true;
        }
        for (int i = 2; i < number; i++) {
            if (number%i == 0) {
                counter++;
            }else{
                continue;
            }
        }

        if (counter == 0) {
            return true;
        }else{
            return false;
        }
    }

    public  int hex2int(String hex) {
        String options[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "a", "b", "c", "d", "e", "f"};
        for (int i = 0; i < options.length; i++) {
            if (hex == options[i]) {
                if (i<=15) {
                    return i;
                }else{
                    return i-6;
                }
            }else{
                continue;
            }
        }
        return -1;
    }
    public String int2hex(int value) {
        String options[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        String result = "-1";
        if (value < 0 || value > 15) {
            return "-1";
        }
        
        for (int i = 0; i <= value; i++) {
            result = options[i];
        }
        return result;
    }


}
