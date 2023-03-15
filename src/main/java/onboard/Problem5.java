package onboard;

import java.util.Arrays;

public class Problem5 {
    public static Integer solution(Integer N, Integer K, Integer[] values){
        Integer answer = 0;
        int price = K;

        for (int i = N-1; i>=0; i--){
            answer += price/values[i];
            price %= values[i];
        }
        return answer;
    }
}
