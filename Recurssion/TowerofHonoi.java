package Recurssion;

public class TowerofHonoi{
    public static void TowerOf(int n,char src,char aux,char dest){
        if(n == 1){
            System.out.println(src +"->" + dest);
            return;
        }

        TowerOf(n-1,src,dest,aux);
        TowerOf(1,src,aux,dest);
        TowerOf(n-1,aux,src,dest);
    }

    public static void main(String[] args){
        TowerOf(3,'A','B','C');

    }

}




