 class SecondLargest {
    public static void main(String []args){
        int arr[]={2,6,3,78,23,99};
        int largest= Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int secondSmall= Integer.MAX_VALUE;

        for(int i =0; i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest= arr[i];
            }
            else if (arr[i]>secondLargest){
                secondLargest=arr[i];
            }

        }
        System.out.println(secondLargest);

        for(int j=0 ; j<arr.length;j++){
            if(arr[j]<small){
                secondSmall=small;
                small=arr[j];
            }
            else if (arr[j]<secondSmall){
                secondSmall=arr[j];
            }
        }
        System.out.println(secondSmall);
    }
 }