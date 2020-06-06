package br.anhembi.aps.structure;

import br.anhembi.aps.exceptions.InsertNullException;

public class BSTree<Type extends Comparable<Type>> implements BSTreeADT<Type> {

    private Node<Type> root;

    public BSTree() {
        this.root = null;
    }

    @Override
    public void insertItem(Type data) {
        if (data == null) {
            throw new InsertNullException();
        }

        this.root = this.insertItem(this.root, data);
    }

    @Override
    public void traversingPreOrder() {
        if (this.root != null) {
            System.out.println(this.root.data);
            this.traversingPreOrder(this.root.left);
            this.traversingPreOrder(this.root.right);
        }
    }

    @Override
    public void traversingInOrder() {
        if (this.root != null) {
            this.traversingInOrder(this.root.left);
            System.out.println(this.root.data);
            this.traversingInOrder(this.root.right);
        }
    }

    @Override
    public void traversingPostOrder() {
        if (this.root != null) {
            traversingPostOrder(this.root.left);
            traversingPostOrder(this.root.right);
            System.out.println(this.root.data);
        }
    }

    private Node<Type> insertItem(Node<Type> root, Type data) {
        if (root == null) {
            return new Node(data);
        } else {
            if (data.compareTo(root.data) < 0) {
                root.left = insertItem(root.left, data);
            } else if (data.compareTo(root.data) > 0) {
                root.right = insertItem(root.right, data);
            } else {
                return root;
            }
        }
        return root;
    }

    private void traversingPreOrder(Node<Type> root) {
        if (root != null) {
            System.out.println(root.data);
            this.traversingPreOrder(root.left);
            this.traversingPreOrder(root.right);
        }
    }

    private void traversingInOrder(Node<Type> root) {
        if (root != null) {
            this.traversingInOrder(root.left);
            System.out.println(root.data);
            this.traversingInOrder(root.right);
        }
    }

    private void traversingPostOrder(Node<Type> root) {
        if (root != null) {
            traversingPostOrder(root.left);
            traversingPostOrder(root.right);
            System.out.println(root.data);
        }
    }

    @Override
    public boolean isEmpty() {
        return this.root == null;
    }

    @Override
    public boolean contains(Type data) {
        if (this.root == null || data == null) 
            return false;
       
        return this.contains(this.root, data);
    }
    
    private boolean contains(Node<Type> child, Type data){
        if (child == null) 
            return false;
        
        int result = data.compareTo(child.data);
        
        if(result == 0)
            return true;
    
        if(result < 0 && child.left != null)
            return this.contains(child.left, data);  
        
        if(result > 0 && child.right != null)
            return this.contains(child.right, data);
        
        return false;
    }
   

    @Override
    public void delete(Type data) {
        if (data != null && this.root != null)
            this.root = delete(this.root, data);
    }
    
    private Node<Type> delete(Node<Type> root, Type data) {
        if (root != null) {
            
            int result = data.compareTo(root.data);
            
            if (result < 0)
                root.left = delete(root.left, data);
            else if (result > 0) 
                root.right = delete(root.right, data);
            else if (root.left == null)
                root = root.right;
            else if (root.right == null)
                root = root.left;
            else 
                root.right = this.getMinOfRightSubTree(root, root.right);
        }
        return root;
    }

    private Node<Type> getMinOfRightSubTree(Node<Type> root, Node<Type> subTreeRoot) {
        if (subTreeRoot.left == null) {
            root.data = subTreeRoot.data;
            return subTreeRoot.right;
        } else {
            subTreeRoot.left = this.getMinOfRightSubTree(root, subTreeRoot.left);
        }
        return subTreeRoot;
    }
}
