class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] state = new int[n]; // 0: unvisited, 1: visiting, 2: safe, 3: unsafe
        List<Integer> safeNodes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (dfs(i, graph, state)) {
                safeNodes.add(i);
            }
        }

        return safeNodes;
    }

    private boolean dfs(int node, int[][] graph, int[] state) {
        if (state[node] == 1) {
            state[node] = 3;
            return false;
        }
        if (state[node] == 2 || state[node] == 3) {
            return state[node] == 2;
        }
        state[node] = 1;

        for (int neighbor : graph[node]) {
            if (!dfs(neighbor, graph, state)) {
                state[node] = 3;
                return false;
            }
        }
        state[node] = 2;
        return true;
    }
}