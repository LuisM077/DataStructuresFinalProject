
public class TestTime
{
    public static void main(String[] args) {
        
        SortAlgorithms test0 = new SortAlgorithms();
        
        
        //BubbleSort
        int[] bubble = new int[150000];
        test0.add(bubble);
        long bubbleStart = System.currentTimeMillis();
        test0.bubbleSort(bubble);
        long bubbleEnd = System.currentTimeMillis();
        //System.out.println("Size of array: " + bubble.length);
        //System.out.println("Bubble sort: " + (bubbleEnd - bubbleStart) + " ms");
        System.out.println(bubbleEnd - bubbleStart);
        
       
        
        //SelectionSort
        int[] selection = new int[200000];
        test0.add(selection);
        long selectionStart = System.currentTimeMillis();
        test0.selectionSort(selection);
        long selectionEnd = System.currentTimeMillis();
        //System.out.println("Size of array: " + selection.length);
        //System.out.println("Selection sort: " + (selectionEnd - selectionStart) + " ms");
        System.out.println(selectionEnd - selectionStart);
        
        
        
        //InsertionSort
        int[] insertion = new int[200000];
        test0.add(insertion);
        long insertionStart = System.currentTimeMillis();
        test0.insertionSort(insertion);
        long insertionEnd = System.currentTimeMillis();
        //System.out.println("Size of array: " + insertion.length);
        //System.out.println("Insertion sort: " + (insertionEnd - insertionStart) + " ms");
        System.out.println(insertionEnd - insertionStart);
        
        
        
        //Merge Sort
        int[] merge = new int[200000];
        test0.add(merge);
        long mergeStart = System.currentTimeMillis();
        test0.mergeSort(merge);
        long mergeEnd = System.currentTimeMillis();
        //System.out.println("Size of array: " + merge.length);
        //System.out.println("Merge sort: " + (mergeEnd - mergeStart) + " ms");
        System.out.println(mergeEnd - mergeStart);
        
        
        
        //ShellSort
        int[] shell = new int[200000];
        test0.add(shell);
        long shellStart = System.currentTimeMillis();
        test0.shellSort(shell);
        long shellEnd = System.currentTimeMillis();
        //System.out.println("Size of array: " + shell.length);
        //System.out.println("Shell sort: " + (shellEnd - shellStart) + " ms");
        System.out.println(shellEnd - shellStart);
        
        
        
        //QuickSort
        int[] quick = new int[200000];
        test0.add(quick);
        long quickStart = System.currentTimeMillis();
        test0.quickSort(quick);
        long quickEnd = System.currentTimeMillis();
        //System.out.println("Size of array: " + quick.length);
        //System.out.println("Quick sort: " + (quickEnd - quickStart) + " ms");
        System.out.println(quickEnd - quickStart);
        
        
        
        //Heap Sort
        int[] heap = new int[200000];
        test0.add(heap);
        long heapStart = System.currentTimeMillis();
        test0.heapSort(heap);
        long heapEnd = System.currentTimeMillis();
        //System.out.println("Size of array: " + heap.length);
        //System.out.println("Heap sort: " + (heapEnd - heapStart) + " ms");
        System.out.println(heapEnd - heapStart);
        
        
    }
}
