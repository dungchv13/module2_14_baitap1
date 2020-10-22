public class InsertionSort {
    static int[] list = {5,8,3,6,2,1,4,9,7,0};
    public static void insertionSort(int[] list){
        for (int i = 1;i < list.length;i++){
            int currentElement = list[i];
            int k = i-1;
            for(;k>= 0 && list[k]>currentElement;k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
    }

    public static void main(String[] args) {
        System.out.println("pre-sort:");
        for (int n:list
             ) {
            System.out.print(n+" ,");
        }
        System.out.println("\nafter-sort");
        insertionSort(list);
        for (int n:list
             ) {
            System.out.print(n+" ,");
        }
    }
}
