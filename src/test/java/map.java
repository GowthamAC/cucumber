import java.util.*;

public class map {

    public static void main(String[] args) {

      String str = "aa22b44c99d1";
      char [] ch = str.toCharArray();
      int sum=0;
      int tsum=0;
      ArrayList<Integer> list = new ArrayList();
      for (int i=0; i<ch.length; i++){
          int a=ch[i]-48;
          if(a>=0 && a<=9){
              sum=sum*10+ a;
          }else{
              list.add(sum);
              sum=0;
          }
      }
        System.out.println(list);
      for(int a : list){
          tsum=tsum+a;
      }

        System.out.println(tsum);
    }

}