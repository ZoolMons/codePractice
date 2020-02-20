package WhiteBoard;

import java.util.List;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2019-12-30:2019
 * Des:
 */
public class Tree {
    public  TreeNode createTree(List<Integer> integerList){
        if (integerList == null){
            return null;
        }
        TreeNode firstNode = new TreeNode(integerList.get(0));
        TreeNode nextNode = createTree(integerList.subList(1, integerList.size()));
        firstNode.setNext(nextNode);
        return firstNode;
    }
}

/**
 * 定义一个数的结点
 */
class TreeNode{
    private  final Integer value;
    private  TreeNode next;

    public TreeNode(Integer value) {
        this.value = value;
        next = null;
    }

    public TreeNode getNext() {
        return next;
    }

    public void setNext(TreeNode next) {
        this.next = next;
    }
}
