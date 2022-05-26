package Day5Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Problems {
	public static void main(String[] args) {
		swapAlternate(new int[] {1,2,3,4,5,6});
		uniqueEl(new int[] {22,22,23,23,24,24,25});
		intersection(new int[] {2,2,3,3,4,5},new int[] {2,3,4,5});
		findDuplicates(new int[] {2,2,1,1,5,6});
		uniqueOccurrences(new int[] {2,2,1,3,3,3});
		sortZeroOneTwo(new int[] {1,2,2,2,0,1,2,0,1,0,1,0});
	}
	
	//1.swap alternate elements
	public static void swapAlternate(int[] arr) {
		int i = 0;
		int j = 1;
		while(i < arr.length && j < arr.length) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i+=2;
			j+=2;
		}
		for (int res : arr) {
			System.out.print(res + " ");
		}
		System.out.println();
	}
	
	//find unique in array if all elements are are present twice
	
	public static void uniqueEl(int[] arr) {
		int el = 0;
		for(int i = 0;i<arr.length;i++) {
			el = el ^ arr[i];
		}
		
		System.out.println(el);
	}
	//3.Unique Number of Occurrences
	//Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.
	public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> occ = new HashMap<Integer,Integer>();
        for(int i = 0;i<arr.length;i++){
            if(occ.containsKey(arr[i])){
                occ.put(arr[i],occ.get(arr[i]) + 1);
            }else{
                occ.put(arr[i],1);
            }
        }
        int mapFreq = 0;
        int setFreq = 0;
        
        HashSet<Integer> set = new HashSet<Integer>();
		for(int res :occ.values()) {
			set.add(res);
            mapFreq += res;
		}
        
        for(int i : set){
            setFreq += i;
        }
        
        
        
        return mapFreq == setFreq;
        
    }
	
	//find all duplicates in an array
	
    public static List<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1);
            }else{
                map.put(arr[i],1);
            }
        }
        
        for(int i :map.keySet()){
            if(map.get(i) == 2){
                al.add(i);
            }
        }
        
        return al;
    }
    
    //intersection of two sorted arrays
    public static void intersection(int[] arr1, int[] arr2) {
    	int i = 0,j = 0;
    	while(i < arr1.length && j< arr2.length) {
    		if(arr1[i] == arr2[j]) {
    			System.out.print(arr1[i] + " ");
    			i++;
    			j++;
    		}else if(arr1[i] < arr2[j]) {
    			i++;
    		}else {
    			j++;
    		}
    	}
    }
    //sort 0 1 2
    public static void sortZeroOneTwo(int[] arr) {
    	int left = 0;
    	int right = arr.length - 1;
    	
    	while(left < right) {
    		while(arr[left] == 1 || arr[left] == 0 && left < right ) {
    			left++;
    		}
    		while(arr[right] == 2  && left < right ) {
    			right--;
    		}
    		
    		if(arr[left] == 2 && arr[right] == 0 ||arr[right] == 1 && left < right) {
    			int temp = arr[left];
    			arr[left] = arr[right];
    			arr[right] = temp;
    			left++;
    			right--;
    		}
    	}
    	left = 0;
    	right = arr.length - 1;
    	
    	while(left < right) {
    		while(arr[left] == 0 && left < right ) {
    			left++;
    		}
    		while(arr[right] == 2 ||arr[right] == 1  && left < right ) {
    			right--;
    		}
    		
    		if(arr[left] == 1 && arr[right] == 0 && left < right) {
    			int temp = arr[left];
    			arr[left] = arr[right];
    			arr[right] = temp;
    			left++;
    			right--;
    		}
    	}
    	
    	System.out.println();
    	for (int i : arr) {
			System.out.print(i + " ");
		}
    }
}
