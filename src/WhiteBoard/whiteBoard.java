package WhiteBoard;

import java.util.ArrayList;
public class whiteBoard {
    public int minNumberInRotateArray(int [] array) {
        if(array.length <= 0 ){
            return 0;
        }
        int middle = array.length / 2;
        while(true){
            if(array[middle] > array[array.length - 1]){
                if(array[middle] > array[middle +1]){
                    return array[middle +1];
                }
                middle++;
            }else{
                middle--;
            }
        }
    }
}