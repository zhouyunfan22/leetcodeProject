package main.java;
//假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
//
//        给你一个整数数组  flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。另有一个数 n ，能否在不打破种植规则的情况下种入 n 朵花？能则返回 true ，不能则返回 false。
//
//         
//
//        示例 1：
//
//        输入：flowerbed = [1,0,0,0,1], n = 1
//        输出：true
//        示例 2：
//
//        输入：flowerbed = [1,0,0,0,1], n = 2
//        输出：false
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
