import java.util.Random;

public class SortAlgorithms
{
    public void add(int[] a) {
        Random generator = new Random();
        
        for(int i = 0; i < a.length; i++) {
            a[i] = 1 + generator.nextInt(100);
        }
    }
    
    //Bubble sort
    //Credit to Bro Code
    public void bubbleSort(int[] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length - 1; j++) {
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    
    //Selection Sort
    //Credit to the Data Structures book for the algorithm
    public void selectionSort(int[] a) {
        int smallest;
        
        for(int i = 0; i < a.length - 1; i++) {
            smallest = i;
            for(int j = i+1; j < a.length; j++) {
                if(a[smallest] > a[j]) {
                    smallest = j;
                }
            }
            int temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;
        }
    }
    
    //Insertion Sort
    //Credit to the Data Structures book for the algorithm 
    public void insertionSort(int[] a) {
        for(int nextPos = 1; nextPos<a.length;nextPos++) {
            insert(a,nextPos);
        }
    }
    public void insert(int[] a, int nextPos) {
        int nextVal = a[nextPos];
        while(nextPos > 0 && nextVal < a[nextPos - 1]) {
            a[nextPos] = a[nextPos - 1];
            nextPos--;
        }
        a[nextPos] = nextVal;
    }
    
    //Merge Sort
    //Credit to professor Byron Hoy for the algorithm
    public void mergeSort(int[] a) {
        if( a.length > 1) {
            int half = a.length / 2;
            int[] left = new int[half];
            int[] right = new int[a.length - half];
            int j = 0;
            
            for(int i = 0; i < a.length; i++) {
                if(i < half) {
                    left[i] = a[i];
                }
                else {
                    right[j] = a[i];
                    j++;
                }
            }
        
            mergeSort(left);
            mergeSort(right);
            merge(a, left, right);
        }
    }
    //Credit to Bro Code on youtube for the merge method. Was not able to copy the elements from temp array properly
    public void merge(int[] a, int[] left, int[] right) {
        
        int i = 0;
        int l = 0;
        int r = 0;
        
        while(l < left.length && r < right.length) {
            if(left[l] < right[r]) {
                a[i] = left[l];
                i++;
                l++;
            }
            else {
                a[i] = right[r];
                i++;
                r++;
            }
        }
        while(l < left.length) {
            a[i] = left[l];
            i++;
            l++;
        }
        while(r < left.length) {
            a[i] = right[r];
            i++;
            r++;
        }
    }
    
    //Shell Sort
    //Credit to tutorialspoint for the algorithm
    public void shellSort(int[] a) {
        int interval = 1;
        int i = 0;
        
        while(interval < a.length/3) {
            interval = interval * 3 + 1;
        }
        
        while(interval > 0) {
            for(int outer = interval; outer < a.length; outer++) {
                int valueToInsert = a[outer];
                int inner = outer;
                
                while(inner > interval - 1 && a[inner - interval] >= valueToInsert) {
                    a[inner] = a[inner - interval];
                    inner = inner - interval;
                }
                a[inner] = valueToInsert;
            }
            interval = (interval-1) / 3;
            i++;
        }
    }
    
    //Quick Sort
    ////Credit to the Data Structures book and Javatpoint.
    //I followed the algorithm provided and check my work with the code provided
    public void quickSort(int[] a) {
        quickSortArray(a, 0, a.length -1);
    }
    public void quickSortArray(int[] a, int start, int end) {
        if(start < end) {
            int pivIndex = partition(a,start,end);
            quickSortArray(a,start,pivIndex -1);
            quickSortArray(a,pivIndex + 1, end);
        }
    }
    public int partition(int[] a, int start, int end) {
        int pivot = a[start];
        int up = start;
        int down = end;
        
        while(up < down){
            while(up < end && a[up] >= pivot) {
                up++;
            }
            while(down > start && a[down] < pivot) {
                down--;
            }
            if(up < down) {
                swap(a, up, down);
            }
        }
        swap(a, start, down);    
        return down;
    }

    //Heap Sort
    //Credit to the Data Structures book. 
    //I followed the algorithm provided and check my work with the code provided
    public void heapSort(int[] a) {
        buildHeap(a);
        shrinkHeap(a);
    }
    public void buildHeap(int[] a) {
        int n = 1;
        while(n < a.length) {
            n++;
            int child = n - 1;
            int parent = (child - 1) / 2;
            while(parent >= 0 && a[parent] < a[child]) {
                swap(a, parent, child);
                child = parent;
                parent = (child - 1) / 2;
            }
        }
    }
    public void shrinkHeap(int[] a) {
        int n = a.length;
        while(n > 0) {
            n--;
            swap(a, 0, n);
            int parent = 0;
            while(true) {
                int leftChild = 2 * parent + 1;
                if(leftChild >= n) {
                    break;
                }
                int rightChild = leftChild + 1;
                int maxChild = leftChild;
                if(rightChild < n && a[leftChild] < a[rightChild]) {
                    maxChild = rightChild;
                }
                if(a[parent] < a[maxChild]) {
                    swap(a, parent, maxChild);
                    parent = maxChild;
                }
                else {
                    break;
                }
            }
        }
    }
    
    //Print array method
    public void print(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
    //Swap method
    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
