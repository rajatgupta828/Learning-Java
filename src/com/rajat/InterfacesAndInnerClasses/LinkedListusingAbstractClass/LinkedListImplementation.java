package com.rajat.InterfacesAndInnerClasses.LinkedListusingAbstractClass;

public class LinkedListImplementation implements NodeList{

    private ListItem root = null;

    public LinkedListImplementation(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null){
            //if list item is empty
            this.root = item;
            return true;
        }
        // If list is already having data
        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(item);
            if(comparison < 0){
                // New item is greater
                if (currentItem.next() != null){
                        currentItem = currentItem.next();
                }else{
                    // There is no next
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            }else if(comparison > 0){
                if (currentItem.previous() != null){
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                    return true;
                }else{
                    item.setNext(this.root);
                    this.root.setPrevious(item);
                    this.root = item;
                }
            }else{
                // equal
                System.out.println(item.getValue() + " Is already Present");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
