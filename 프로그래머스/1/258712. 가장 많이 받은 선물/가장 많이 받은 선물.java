import java.io.*;
import java.util.*;
    
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        Map<String, Integer> nameToIdx = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nameToIdx.put(friends[i], i);
        }

        int[][] giftMatrix = new int[n][n];
        int[] giftScore = new int[n];

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int giver = nameToIdx.get(parts[0]);
            int receiver = nameToIdx.get(parts[1]);

            giftMatrix[giver][receiver]++;
        }

        for (int i = 0; i < n; i++) {
            int give = 0, take = 0;
            for (int j = 0; j < n; j++) {
                give += giftMatrix[i][j];
                take += giftMatrix[j][i];
            }
            giftScore[i] = give - take;
        }

        int[] nextReceived = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (giftMatrix[i][j] > giftMatrix[j][i]) {
                    nextReceived[i]++;
                } else if (giftMatrix[i][j] == giftMatrix[j][i] && giftScore[i] > giftScore[j]) {
                    nextReceived[i]++;
                }
            }
        }

        int maxGifts = 0;
        for (int received : nextReceived) {
            maxGifts = Math.max(maxGifts, received);
        }

        return maxGifts;
    }
}