ADT(Abstract Data Type) :二叉查找树(BST).BST是两种库集合类TreeSet,TreeMap实现的基础.

树tree:如果不是空集合,则树是由称为根(root)的节点r以及0个或者多个非空指数T<sub>1</sub>,T<sub>2</sub>等组成,这些子树中每一棵的根都是被来自根r的一条有向的边(edge)所连结.

![300px-Binary_tree.svg](../../../../../Downloads/300px-Binary_tree.svg.png)

A simple unordered tree; in this diagram, the node labeled 7 has two children, labeled 2 and 6, and one parent, labeled 2. The root node, at the top, has no parent.

没有子节点的节点称为**树叶(leaf)**,如左下角②.

从节点**n<sub>1</sub>**到**n<sub>k</sub>**的**路径(path)**定义为节点**n<sub>1</sub>**,...,**n<sub>k</sub>**的一个序列,使得对于1≤i＜k节点**n<sub>i</sub>**是**n<sub>i+1</sub>**的父节点.

路径的**长(length)** 是该路径上的边的条数,即k-1.

对于任意节点**n<sub>i</sub>**,其**深度(depth)** 为从根到**n<sub>i</sub>** 的唯一的路径的长.所以,根的深度是0.

**n<sub>i</sub>** 的 **高(high)** 是从 **n<sub>i</sub>** 到一片树叶的最长的路径的长.

二叉树的一个性质是一棵平均二叉树的深度要比节点个数N小得多.其平均深度是*O($\sqrt{N}$)*.

```java
class TreeNode{
    Object element;
  	TreeNode firstChild;
  	TreeNode nextChild;
}
```

