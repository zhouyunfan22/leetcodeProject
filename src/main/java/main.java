package main.java;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws IOException {
//        int[]a={};
//        int[]b={1};
//
//        findMedianSortedArrays f=new findMedianSortedArrays();
//        System.out.print(f.findMedianSortedArrays1(a,b));

//        FileUtils f=new FileUtils();
//        String s=f.readFile("E:\\leetcodeProject\\src\\main\\java\\shuzu.txt");
////        System.out.println(s);
//        String[] arr = s.split(","); // 用,分割
//
//            arr[arr.length-1]="29079";
//
//
////        int[] a = Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
//        int[] array = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
//        System.out.print(a);
//        int[]array={6,1,2,3,4,5,6};
//        trap t=new trap();
//        long startTime = System.currentTimeMillis();
////        System.out.print(t.find0(a));
//        System.out.print(t.trap(array));
//        long endTime = System.currentTimeMillis();    //获取结束时间
//        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");

//        int[]a={0,0,0,1,0,0,0,1,0,0};
//        canPlaceFlowers c=new canPlaceFlowers();
//        System.out.print(c.canPlaceFlowers(a,4));
//
//        defangIPaddr d=new defangIPaddr();
//        System.out.print(d.defangIPaddr("1.1.1.1"));
        int []a={1,3};
        findPoisonedDuration f=new findPoisonedDuration();
        int b=f.findPoisonedDuration(a,2);
        System.out.print(b);




}

}


