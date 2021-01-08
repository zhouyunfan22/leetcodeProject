package main.java;

public class canPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length=flowerbed.length;
        int[]flowerbed_tmp=new int[length+4];
        flowerbed_tmp[0]=1;
        flowerbed_tmp[1]=0;
        flowerbed_tmp[length+2]=0;
        flowerbed_tmp[length+3]=1;
        for(int i=0;i<length;i++){
            flowerbed_tmp[i+2]=flowerbed[i];
        }
        int m=find0(flowerbed_tmp);
        if(n>m){
            return false;
        }
        return true;
    }
    public int find0(int[]flowerbed){
        int length=flowerbed.length;
        int res=0;
        int f=0;
        for(int i=0;i<length;i++){
            if(flowerbed[i]==0){
                f++;
            }
            else{
                if(f%2==0){
                    if(f>2){
                        res=res+(f-2)/2;
                    }

                }else{
                    res=res+f/2;
                }

                f=0;
            }


        }
        return res;
    }
}
