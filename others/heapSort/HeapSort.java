package others.heapSort;


public class HeapSort {

  public static void main(String[] args) {
    int[] arr = new int[10];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) Math.floor(Math.random() * arr.length);
    }

    System.out.println("\nDesordenado: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+", ");
    }

    // Heap sort
    int arrSize = arr.length;

    for (int i = arrSize/2 - 1; i >= 0 ; i--) {
      heapSort(arr, arrSize, i);
    }

    System.out.println("\n\nQuase Ordenado: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+", ");
    }

    // Ordena 100%
    for (int j = arrSize-1; j > 0; j--) {
      int aux = arr[0];
      arr[0] = arr[j];
      arr[j] = aux;

      heapSort(arr, j, 0);
    }

    System.out.println("\n\nOrdenado: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+", ");
    }
  }


  private static void heapSort(int[] arr, int size, int i) {
    int root = i;
    int left = 2*i+1;
    int right = 2*i+2;

    if (left < size && arr[left] > arr[root]) {
      root = left;
    }

    if (right < size && arr[right] > arr[root]) {
      root = right;
    }

    if (root != i) {
      int aux = arr[i];
      arr[i] = arr[root];
      arr[root] = aux;

      heapSort(arr, size, root);
    }
  }
}

