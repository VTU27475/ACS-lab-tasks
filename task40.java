import java.util.*;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) {
            return result;
        }

        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode current = stack.pop();
            result.add(current.val);

            // Push right first
            if (current.right != null) {
                stack.push(current.right);
            }

            // Push left second
            if (current.left != null) {
                stack.push(current.left);
            }
        }

        return result;
    }
}