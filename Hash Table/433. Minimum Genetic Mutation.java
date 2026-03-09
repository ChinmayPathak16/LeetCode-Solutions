class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> set = new HashSet<>(Arrays.asList(bank));
        if (!set.contains(endGene)) return -1;

        char[] genes = {'A','C','G','T'};
        Queue<String> q = new LinkedList<>();
        q.add(startGene);

        int steps = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                String curr = q.poll();

                if (curr.equals(endGene)) return steps;

                char[] arr = curr.toCharArray();

                for (int j = 0; j < arr.length; j++) {
                    char old = arr[j];

                    for (char c : genes) {
                        arr[j] = c;
                        String next = new String(arr);

                        if (set.contains(next)) {
                            q.add(next);
                            set.remove(next);
                        }
                    }

                    arr[j] = old;
                }
            }
            steps++;
        }

        return -1;
    }
}
