class EvenOrOdd{
    public static void main(String[] args){
        int[] arr1 = {2,3,4,5,6};
        int countEven = 0;
        int countOdd = 0;
        for(int i = 0;i < arr1.length; i++){
            if(arr1[i] % 2 == 0){
                countEven++;
            }
            else{

                countOdd++;
            }

        }
        System.out.println("the Even no. is "+countEven);
        System.out.println("the Odd no. is "+countOdd);

    }
    
}