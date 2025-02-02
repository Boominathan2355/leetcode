import java.util.*;

class LockingTree {
    int[] parent;
    List<List<Integer>> children;
    Map<Integer, Integer> locked;

    public LockingTree(int[] parent) {
        this.parent = parent;
        int n = parent.length;
        children = new ArrayList<>(n);
        locked = new HashMap<>();

        for (int i = 0; i < n; i++) children.add(new ArrayList<>());
        for (int i = 1; i < n; i++) children.get(parent[i]).add(i);
    }

    public boolean lock(int num, int user) {
        return locked.putIfAbsent(num, user) == null;
    }

    public boolean unlock(int num, int user) {
        return locked.getOrDefault(num, -1) == user && locked.remove(num) != null;
    }

    public boolean upgrade(int num, int user) {
        if (locked.containsKey(num) || hasLockedAncestor(num) || !hasLockedDescendants(num)) return false;
        unlockDescendants(num);
        locked.put(num, user);
        return true;
    }

    private boolean hasLockedAncestor(int num) {
        while ((num = parent[num]) != -1) if (locked.containsKey(num)) return true;
        return false;
    }

    private boolean hasLockedDescendants(int num) {
        for (int child : children.get(num)) 
            if (locked.containsKey(child) || hasLockedDescendants(child)) return true;
        return false;
    }

    private void unlockDescendants(int num) {
        for (int child : children.get(num)) {
            locked.remove(child);
            unlockDescendants(child);
        }
    }
}
