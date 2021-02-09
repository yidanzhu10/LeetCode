import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * File Name: duplicateN.java
 *
 * To Compile: IntUtil.java RandomInt.java duplicateN.java duplicateNTest.java
 *
 * @author Jagadeesh Vasudevamurthy
 * @year 2021
 */

/************************************************************
 Nothing can be changed in class duplicateN
 *************************************************************/
class duplicateN{
    private int[] a ; //a[i] guaranteed > 0 && < n-1
    //contents of a should be exactly like the original after your algorithms
    private String algName ;
    private int [] numDup ;
    private double [] work ;
    private boolean show ; //show only is show = true

    duplicateN(int[] a, String algName,int [] numDup,double [] work, boolean show) {
        this.a = a ;
        this.algName = algName;
        this.numDup = numDup;
        this.work = work ;
        this.show = show ;
        AlgduplicateN b = new AlgduplicateN(this,algName,show) ;
    }

    public int size() {
        return a.length ;
    }
    public int getI(int i) {
        work[0]++ ;
        return a[i];
    }
    public void setI(int i, int v) {
        work[0]++ ;
        a[i] = v ;
    }

    public void setnumDup(int v) {
        numDup[0] = v ;
    } // counter
}

/************************************************************
 WRITE CLASS AlgduplicateN
 YOU CAN HAVE ANY NUMBER OF PRIVATE VARIABLES and FUNCTIONS
 *************************************************************/
class AlgduplicateN {
    private duplicateN f;
    private String algName;
    private boolean show ; //show only is show = true

    AlgduplicateN(duplicateN f, String algName, boolean show) {
        //NOTHING CAN BE CHANGED HERE
        this.f = f ;
        this.show = show;
        if (algName == "NsquareTimeConstantSpace") {
            alg_nsquare_time_constant_space();
        }else if (algName == "NTimeNSpace") {
            alg_ntime_n_space();
        }else if (algName == "NTimeConstantSpace") {
            alg_ntime_constant_space();
        }
    }

    /*
     * WRITE YOUR CODE BELOW
     */


    /*
     * Time complexity O(n^2)
     * Space Complexity O(1)
     */
    private void alg_nsquare_time_constant_space() {
        int count = 0;
        int len = f.size();
        if(show) {
            System.out.print("duplicate {");
        }
        for(int i = 0; i < len ; i ++) {
            boolean dup = false;
            int occur = 1;

            for(int j = i + 1; j < len; j ++) {
                if(f.getI(i) == f.getI(j)) {
                    occur ++;
                    dup = true;
                }
            }
            if(occur == 2 && dup == true) {
                count ++;
                if(show) {
                    System.out.print(f.getI(i) + " ");
                }
            }
        }
        if(show) {
            System.out.println("}");
            System.out.println("Num duplicates = " + count);
        }
    }

    /*
     * Time complexity O(n)
     * Space Complexity O(n)
     */
    private void alg_ntime_n_space() {
        int len = f.size();
        if(show) {
            System.out.print("duplicate {");
        }

        int[] num = new int[len];
        for(int i = 0; i < len; i ++) {
            num[i] = f.getI(i);
        }

        for(int i = 0; i < len; i ++) {
            int index = Math.abs(num[i] % len);
            // num[index] = num[index] + len;
            int value = num[index] + len;
            if(value >= 3 * len) {
                continue;
            } // Used to control the range of value. When the size of array is extremely large, value will exceed the range of Integer
            else {
                num[index] = value;
            }
        }
        int count = 0;
        for(int i = 0; i < len; i ++) {
            if((num[i] / len) >= 2) {
                count ++;
                if(show) {
                    System.out.print(i + " ");
                }
            }
        }
        if(show) {
            System.out.println("}");
            System.out.println("Num duplicates = " + count);
        }
    }

    /*
     * Time complexity O(n)
     * Space Complexity O(1)
     */
    private void alg_ntime_constant_space() {
        int len = f.size();
        int count = 0;
        if (show) {
            System.out.print("duplicate { ");
        }

        for(int i = 0; i < len; i ++) {
            int index = (f.getI(i) % len);
            int value = Math.abs(f.getI(index) + len);
            // f.setI(index, value);
            if(value >= 3 * len) {
                continue;
            }
            else {
                f.setI(index, value);
            }
        }
        for(int i = 0; i < len; i ++) {
            if((f.getI(i) / len) >= 2) {
                count ++;
                if(show) {
                    System.out.print(i + " ");
                }
            }
        }
        for(int i = 0; i < len; i ++) {
            if(f.getI(i) >= len){
                int value = Math.abs(f.getI(i) % len);
                f.setI(i, value);
            }
        }
        if (show) {
            System.out.println("}");
            System.out.println("Num duplicates = " + count);
        }
    }



    public static void main(String[] args) {
        System.out.println("Run duplicateNTest.java");
    }
}

