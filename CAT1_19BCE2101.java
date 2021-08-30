/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;
import java.util.*;
/**
 *
 * @author Gurtavrein Singh
 */
public class CAT1_19BCE2101 {
    public static void main(String args[]){
        Scanner rv=new Scanner(System.in);
        int arr2[][]=new int[3][2]; 
        int index=0,max=0,ravg=0;
         for(int i=0; i<3;i++)
         {            
            for(int j=0; j<2;j++)
            {
                arr2[i][j]=rv.nextInt();
            }
         }
         for(int i=0;i<3;i++){
                ravg=(arr2[i][0]+arr2[i][1])/2;
                if(ravg>max){
                    max=ravg;
                    index=i;
                }
                ravg=0;
             }
         int child=index+1;
         System.out.println("The Child "+child+"has best sleep average= "+max);

        
    }
}
