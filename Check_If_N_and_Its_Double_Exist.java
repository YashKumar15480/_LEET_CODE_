class Solution {
    public boolean checkIfExist(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            int temp = arr[i] * 2;
            for (int j = 0; j < size; j++) {
                if (i != j)
                    if (temp == arr[j])
                        return true;
            }
        }
        return false;

    }
}

public class Check_If_N_and_Its_Double_Exist {
    public static void main(String[] args) {

    }

}
