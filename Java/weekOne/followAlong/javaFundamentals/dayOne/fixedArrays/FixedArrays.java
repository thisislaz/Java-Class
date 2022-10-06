class FixedArrays{
    public static void main(String[] args){
        // initializing and declaring on same line
        int[] myArr = new int[5];
        //initializing on seperate lines
        //myArr = new int[5]
        myArr[0] = 4;
        myArr[1] = 5;
        myArr[2] = 6;
        myArr[3] = 5;
        myArr[4] = 1;
        //initializing the array in one line
        //int[] myArr = {4,5,6,4,1};
        //cannot push or pop with regular array
        //Arraylsit must be used inorder to be able to do those things


        for(int i = 0; i < myArr.length; i++){
            System.out.println(myArr[i]);
        }

        String[] fruits = {"banana", "pear", "papaya", "kiwi"};
        //swap method used on the follwoing three lines
        String temp = fruits[0];
        fruits[0] = fruits[fruits.length-1];
        fruits[fruits.length-1]= temp;
        
        for(int j = 0; j < fruits.length; j++){
            System.out.println(fruits[j]);
        }
    }
}    