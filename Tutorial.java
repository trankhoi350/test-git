import java.util.Arrays;

public class Tutorial 
{
    public static void sortArrayAscending(int[] array)
    {
        int temp = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            
        }
    }
    public static void sortArrayDescending(int[] array)
    {
        int temp = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i] < array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void sortString(char[] array)
    {
        char temp = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static int sumArray(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        return sum;
    }
    public static float averageArray(int[] array)
    {
        int sum = 0;
        float average;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        average = (float) sum / array.length;
        return average;
    }
    public static boolean contains(int[] array, int item)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == item)
            {
                return true;
            }
        }   
        return false;
    }
    public static int findIndex(int[] array, int item)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == item)
            {
                return i;
            }
        }
        return -1;
    }
    public static int[] remove(int[] array, int item)
    {
        int new_array[] = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++)
        {
            if (array[i] != item)
            {
                new_array[j] = array[i];
                j++;
            }
        }
        return new_array;
    }
    public static int[] copyArray(int[] array)
    {
        int[] another_array = new int[array.length];
        for (int i = 0, j = 0; i < array.length; i++)
        {
            another_array[j] = array[i];
            j++;
        }
        return another_array;
    }
    public static void main(String[] args) 
    {
        int[] array = {20, 3, 5, 1, 9, 8, 4, 20, 18};
        char[] word = {'b', 'a', 'd', 'z', 'e', 't', 'r'};
        arr = copyArray(array);
        for (int i = 0; i < array.length; i++)
        {
            System.out.printf("%d", arr[i]);
        } 
        
    }
}