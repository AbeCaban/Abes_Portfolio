public class dualPivotQuicksort {
    
    public static void dualPivotQuicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot1 = arr[low];
            int pivot2 = arr[high];
            
            // Ensure that pivot1 <= pivot2
            if (pivot1 > pivot2) {
                int temp = pivot1;
                pivot1 = pivot2;
                pivot2 = temp;
            }
            
            int i = low + 1;
            int lt = low + 1;
            int gt = high - 1;
            
            while (i <= gt) {
                if (arr[i] < pivot1) {
                    swap(arr, i, lt);
                    lt++;
                } else if (arr[i] >= pivot2) {
                    while (arr[gt] > pivot2 && i < gt) {
                        gt--;
                    }
                    swap(arr, i, gt);
                    gt--;
                    if (arr[i] < pivot1) {
                        swap(arr, i, lt);
                        lt++;
                    }
                }
                i++;
            }
            
            swap(arr, low, lt - 1);
            swap(arr, gt + 1, high);
            
            dualPivotQuicksort(arr, low, lt - 2);
            dualPivotQuicksort(arr, lt, gt);
            dualPivotQuicksort(arr, gt + 2, high);
        }
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
