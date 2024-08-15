package javaPrograms;

public class firstMax {
    public static void main(String[] args) {
        int [] a={1,4,7,-3,5,0};
        int fmax=a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>fmax){
                fmax=a[i];
            }
        }
        int smax=Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i]>smax && a[i]<fmax){
                smax=a[i];
            }
        }
        int tmax = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i]>tmax && a[i]<smax){
                tmax=a[i];
            }
        }

        System.out.println(tmax);
    }
}
