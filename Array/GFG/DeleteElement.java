package Array.GFG;

public class DeleteElement {
    public static void main(String[]args){
        int []arr=new int[5];
        arr[0]=6;
        arr[1]=5;
        arr[2]=4;
        arr[3]=7;
        int n=arr.length;
        System.out.println("Before deletion");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        delete(arr,n,6);
        System.out.println("After deletion");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static int  delete(int[]arr,int n,int x){
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==x){
                break;
            }
        }
        if(i==n){
            return n;
        }
        for(int j=i;j<n-1;j++){
            arr[j]=arr[j+1];
        }
        
        return n-1;
    }
   
    
}
