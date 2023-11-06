package array;

public class DuplicateArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,1};

        int k=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[i];
            if(count==0)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if (temp==arr[j]){
                        count=1;
                        k=arr[i];
                        break;}

                }
                System.out.println(k);

            }

        }

    }
}




