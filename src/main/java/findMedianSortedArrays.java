package main.java;
import java.text.DecimalFormat;
import java.util.Arrays;
public class findMedianSortedArrays {
    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int length1=nums1.length;
        int length2=nums2.length;
        if(length1==0&&length2==0){
            return 0;
        }
        int[] a = new int[length1+length2];
        for(int i=0;i<length1;i++)
        {
            a[i]=nums1[i];
        }
        for(int i=0;i<length2;i++)
        {
            a[length1+i]=nums2[i];
        }
        Arrays.sort(a);

        if((length1+length2)%2==0){
            int num=(length1+length2)/2;
            System.out.print(a[num-1]);
            System.out.print(a[num]);
            float add=a[num-1]+a[num];
            return add/2;

        }
        else{
            int num=(length1+length2)/2;
            double medianum=a[num];
            return medianum;
        }
    }

}
