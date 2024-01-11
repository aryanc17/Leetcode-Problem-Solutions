class Solution {
    public int maxAncestorDiff(TreeNode root) {
        return helper(root, root.val, root.val);
    }

    private int helper(TreeNode root, int min, int max){
        if(root == null) return max - min;

        min = Math.min(min, root.val);
        max = Math.max(max, root.val);

        int leftDiff = helper(root.left, min, max);
        int rightDiff = helper(root.right, min, max);

        return Math.max(leftDiff, rightDiff);
    }
}