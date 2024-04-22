public class LinearSearch {
    public static int linearSearch(int numbers[].int key)
    {
        for (int i; i<numbers.length;i++){
            if (numbers[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int key = 10;
int numbers[] = {2.4.5.6.10.12.14.16};
        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        }else {
            System.out.println("Key is at index : "+index);
        }
    }
}
