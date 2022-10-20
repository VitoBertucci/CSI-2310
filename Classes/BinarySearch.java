package Classes;
public class BinarySearch {
    //recursive binary search
    int binarySearch (int arr[], int a, int b, int key) {
        int mid = a + (b-a) / 2;
        if(b >= a) {
            if(arr[mid] == key) {
                return mid;
            }
            if(arr[mid] > key) {
                return binarySearch(arr, a, mid-1, key);
            }

            return binarySearch(arr, mid+1, b, key);
        }
        return -1;
    }

}
