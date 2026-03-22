class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;

        int m_last = -1, p_last = -1, g_last = -1;

        for(int i=0; i<n; i++){
            if(garbage[i].contains("M")) m_last = i;
            if(garbage[i].contains("P")) p_last = i;
            if(garbage[i].contains("G")) g_last = i;
        }

        int sum = 0;

        // G
        for(int i=0; i<=g_last; i++){
            for(char c : garbage[i].toCharArray()){
                if(c == 'G') sum++;
            }
        }

        // P
        for(int i=0; i<=p_last; i++){
            for(char c : garbage[i].toCharArray()){
                if(c == 'P') sum++;
            }
        }

        // M
        for(int i=0; i<=m_last; i++){
            for(char c : garbage[i].toCharArray()){
                if(c == 'M') sum++;
            }
        }
        
        int travelSum = 0;
        for(int i=0; i<n-1; i++){
            travelSum += travel[i];
            if(i < g_last) sum += travel[i];
            if(i < p_last) sum += travel[i];
            if(i < m_last) sum += travel[i];
        }

        return sum;
    }
}
