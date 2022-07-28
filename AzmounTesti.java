import java.util.Scanner;

public class AzmounTesti{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String pasokh = input.next();
        int tedad_davtalab = input.nextInt();
        String[] pasokhBarg = new String[n];      
        for (int k = 0 ; k < tedad_davtalab ; k++){
            int correct = 0;
            int falsee = 0;
            for (int i = 0 ; i < n ; i++){
                pasokhBarg[i] = input.next();            
                String tmp = pasokhBarg[i];
                int cnt = 0;
                for (int g = 0 ; g < 4 ; g++){
                    if (tmp.charAt(g) == '#'){
                        cnt ++;
                    }
                }
                // System.out.println(((int) pasokh.charAt(i-1)) - 65);
                if (cnt > 1){
                    falsee ++;
                    continue;
                }
                else if ((cnt == 1) && (tmp.charAt(((int) pasokh.charAt(i)) - 65) == '#')){
                    
                    correct ++;
                }
                else if (cnt == 1) {
                    falsee ++;
                }
            }
            System.out.println(3 * correct - falsee);
        }
    }


}