import java.util.*;

class Solution {
    public boolean isSymmetric(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {

            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            // Both are null
            if (left == null && right == null) {
                continue;
            }

            // One is null or values are different
            if (left == null || right == null || left.val != right.val) {
                return false;
            }

            // Add opposite children
            queue.add(left.left);
            queue.add(right.right);

            queue.add(left.right);
            queue.add(right.left);
        }

        return true;
    }
}