//DISPLAY FIRST THREE ELEMENTS OF ARRAY
//2019-Apr-16
class Algorithm
{      
  public void show(int[] arr)
  {
      for(int j=0;j<arr.length;j++)
      {
              System.out.print(arr[j]+" ");
      }
              System.out.println();            
  }
    
  public void showTopFirst(int[] arr, int limit_elements)
  {
      for(int j=arr.length-1;j>limit_elements+1;j--)
      {
              System.out.print(arr[j]+" ");
      }
              System.out.println();            
  }
       

 public int[] selectionSort(int[] arr)
 {

      int  step;
      int min_index;
      int min_value;
      int tmp;
    //STEP1
      step =1 ;
     for(step =1; step < arr.length; step++)
     {
      min_index=step-1;
      min_value =  arr[min_index];

     for (int j=step; j<arr.length;j++)
     {
         if (min_value>arr[j])
         {
             min_index=j;
             min_value=arr[j];
         }    
     }
                           //swap:
         tmp = arr[min_index];
         arr[min_index] = arr[step-1];
         arr[step-1] = tmp;   
//         show(arr);
    }
     return arr;
 }
    
    
}  
public class MainClass {
    public static void main(String[] args) {
    Algorithm algor = new Algorithm();
        int [] arr = new int[]{15,4,3,1,0,7,-1,4};
    algor.show(arr);
    int[] sortedArr = algor.selectionSort(arr);        
        //display top 3 elements
    algor.showTopFirst(sortedArr,3);
        
    }
}