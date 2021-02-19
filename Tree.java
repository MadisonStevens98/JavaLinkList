/*
Madison Stevens
CompSci 182/182L
11-15-17
 */
//the tree class has an insert method to insert the data from a link list into a tree,
//and the required methods from the project (count, find, max, sum, height, average)
package project5;

class Tree {
    
    public Node root;

    public void insert(int id) {
        Node newNode = new Node();
        newNode.iData = id;
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (id < current.iData) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node find(int key) {
        Node current = root;
        while (current.iData != key) {
            if (key < current.iData) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }
    
    public int count(Node current) {
        if (current == null) {
            return 0;
        }
        int visit = 1;
        visit += count(current.leftChild) + count(current.rightChild);
        return visit;
    }

    public int height(Node current) {
        if (current == null) {
            return 0;
        }
        int left = 0;
        int right = 0;
        left = 1 + height(current.leftChild);
        right = 1 + height(current.rightChild);
        if (left > right) {
            return left;
        } else if (right > left) {
            return right;
        } else {
            return left;
        }
    }

    public int sum(Node current) {
        if (current == null) {
            return 0;
        }
        int sum = 0;
        sum += current.iData;
        sum += sum(current.leftChild) + sum(current.rightChild);
        return sum;
    }
    public int average(Node current) {
        int i = sum(current)/count(current);
        return i;
    }

    public Node max() {
        return max(root);
    }

    private Node max(Node max) {
        if (max.rightChild != null) {
            max = max.rightChild;
            return max(max);
        } else {
            return max;
        }
    }
}
