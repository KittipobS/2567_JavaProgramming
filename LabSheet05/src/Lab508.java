import javax.swing.*;

public class Lab508 {

    public static void main(String[] args) {
        int[] nums = {25, 78, 41, 22, 36, 85, 37};
        String prev = "";
        String next = "";
        
        int index = Integer.parseInt(JOptionPane.showInputDialog(null, "Input index of array:"));
        
        while (!checkIndex(nums, index)) {
            index = Integer.parseInt(JOptionPane.showInputDialog(null, "Input index of array, again:"));
        }
        
        if (prevData(nums, index) == -1) {
            prev = "No previous data";
        } else {
            prev = "Previous data, nums[" + (index - 1) + "] is " + prevData(nums, index);
        }
        
        if (nextData(nums, index) == -1) {
            next = "No next data";
        } else {
            next = "Next data, nums[" + (index + 1) + "] is " + nextData(nums, index);
        }
        
        JOptionPane.showMessageDialog(null, "Current data, nums[" + index + "] is " + currentData(nums, index) +
                    "\n" + prev +
                    "\n" + next);
        
    }

    public static boolean checkIndex(int[] nums, int index) {
        return index >= 0 && index < nums.length;
    }

    public static int currentData(int[] nums, int index) {
        return nums[index]; // No need for a loop here, just return the element at the index
    }

    public static int prevData(int[] nums, int index) {
        if (index > 0) {
            return nums[index - 1];
        } else {
            return -1; // No previous data
        }
    }

    public static int nextData(int[] nums, int index) {
        if (index < nums.length - 1) {
            return nums[index + 1];
        } else {
            return -1; // No next data
        }
    }
}
