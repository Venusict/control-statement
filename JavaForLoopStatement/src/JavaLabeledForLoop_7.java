/*We can have a name of each Java for loop. To do so, we use label before the for loop.
It is useful while using the nested for loop as we can break/continue specific for loop.
Note: The break and continue keywords breaks or continues the innermost for loop respectively.*/

public class JavaLabeledForLoop_7 {
    public static void main(String[] args) {
        //Using Label for outer and for loop
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
