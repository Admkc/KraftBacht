package repeat_Lesson;

import java.util.Arrays;

public class Arrays_ {
    public static void main(String[] args) {


        int[] nums=new int[8];
        nums[0]=2;
        System.out.println(Arrays.toString(nums));//[2, 0, 0, 0, 0, 0, 0, 0]
        nums[1]=8;
        nums[2]=9;
        nums[3]=11;
        nums[4]=25;
        nums[5]=29;
        System.out.println(Arrays.toString(nums));//[2, 8, 9, 11, 25, 29, 0, 0]
      int[] saryyy=Arrays.copyOfRange(nums,2,nums.length);


        int [] nums2={4,5,48,79,63,51,24,51,42};

        System.out.println(Arrays.toString(nums2));//[4, 5, 48, 79, 63, 51, 24, 51, 42]
        System.out.println(nums2.length);//9

        int[] nums3=new int[]{9,2,7,8,5,7,41,7,6,8,5,5};
        System.out.println(nums3.length);//12



        //nums2 yi tersten yazdırın//[4, 5, 48, 79, 63, 51, 24, 51, 42]

        System.out.println(Arrays.toString(nums2));

        int[] reverse=new int[nums2.length];

        for (int i=reverse.length-1,k=0  ;  i>=0;   i--,k++){
            reverse[k]=nums2[i];
        }
        System.out.println(Arrays.toString(reverse));//[42, 51, 24, 51, 63, 79, 48, 5, 4]

        //**************************************************
        //tersten yazdırma baska yontem

        int [] reverse2=new int[nums3.length];

        for (int i=reverse2.length-1;i>=0;i--){
            reverse2[reverse2.length-1-i]=nums3[i];

        }
        System.out.println(Arrays.toString(reverse2));//[5, 5, 8, 6, 7, 41, 7, 5, 8, 7, 2, 9]


        //************************************************************************************

        int[][] numbers = new int[2][];

        numbers[0] = new int[3];
        numbers[1] = new int[4];

        numbers[0][0]=10;
        numbers[0][1]=20;
        numbers[0][2]=30;

        numbers[1][0]=60;
        numbers[1][1]=70;
        numbers[1][2]=80;
        numbers[1][3]=90;

        System.out.println(Arrays.deepToString(numbers));//[[10, 20, 30], [60, 70, 80, 90]]

        for (int i = 0; i < numbers.length; i++) {
            System.out.println();
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
        }

        //*************************************************************************sonra bakkkkkkk
        //nums u ascending sorting yapın ////[2, 5, 7, 10, 21, 13, 9, 25]
        System.out.println("----nums sorting-----");

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int tmp = 0;
                if (nums[i]>nums[j]){
                    tmp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=tmp;
                }
            }
            if (nums.length-1>i){
                System.out.print(nums[i]+"<");
            }else{
                System.out.print(nums[i]);

            }//2<5<7<9<10<13<21<25
        }





    }

}
