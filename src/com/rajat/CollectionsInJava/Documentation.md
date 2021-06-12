# Collections

### Basic Details

 Include
 - Arrays
 - ArrayList
 - LinkedList
 - Maps
 - Trees
 - Queues

`Top level of Collection framework is collections class that exposes static method that we can use on collection items.`

Collections framework is designed so that there is good interoperability between different collections.

### Core component -
- Interfaces and implementations of them, like LinkedLIst
- Algorithms - Core Algorithms.

### Binary Search Provided by Collections Framework

If we need to compare 2 elements in a collection, we need it to have implement comparable.

```
    private class Seat implements Comparable<Seat>
```

Then we need to override the method - compareTo which will do the actual comparison, it will return a +,- or 0 while comparison and that's how we need to identify the result of comparison.

Below is an example :

```
        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
```

Here we need to provide what we are comparing to and the field name, in this case :  seatNumber.

To use Binary search :

```aidl
int foundSeat = Collections.binarySearch(seats,requestedSeat,null);
```

It is fastest way to find out a element in a sorted List.

## Collection List Methods

Copying a list to another is as simple as below :

```aidl
ArrayList<Theatre.Seat> seatsCopy = new ArrayList<>(inox.seats);
```
This is called as ShallowCopy.
This will point to the same Arraylist though.

###1. Sort
- Collections.sort() method is available for performing Sorting
- Uses Merge Sort.

###2. Reverse
- Collections.reverse() method is used to reverse the elements present in the Arraylist.

###3. Shuffle
- Collections.shuffle() shuffles the items in a random order or pseudo random order.

###4. Min and Max methods
- We can also use Min and Max elements to get the minimum and maximum elements in the sort order.

```aidl
        // Using the min and max
        Theatre.Seat minSeat = Collections.min(seatsCopy);
        Theatre.Seat maxSeat = Collections.max(seatsCopy);

        System.out.println("Minumim Seat  Number : " + minSeat.getSeatNumber());
        System.out.println("Maximum Seat  Number : " + maxSeat.getSeatNumber());
```

### 5. Swap Method
- We can use Swap method.

```
    // Bubble sort
    public static void sortList(List<? extends  Theatre.Seat> incomingList){
        for(int i = 0; i < incomingList.size() - 1; i++){
            for(int j = i+1; j<incomingList.size();j++){
                if(incomingList.get(i).compareTo(incomingList.get(j)) > 0){
                    Collections.swap(incomingList,i,j);
                }
            }
        }
    }
```

### 6. Copy
Does a deep copy but we have to make sure the target has enough memory.

## Collections - Comparable vs Comparator
Just like Comparable , Collections have comparator which can implememt method called compare.

Comparable needs to be implement comparable :

```aidl
        public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;
        private double price;
```

and then we need to implement the compareTo method :

```aidl
        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
```

Comparator interface defines a single method 'Compare'

Unlike Comparable , objects that need to be sorted don't need to have implement the comparator,
instead we can create a object of type Comparator can be created with the compare method.

More than one comparator can be created, which can allow the objects to be sorted in different manner.


```aidl
    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if(seat1.getPrice() > seat2.getPrice()){
                return 1;
            }else if(seat1.getPrice() < seat2.getPrice()){
                return -1;
            }else{
                return 0;
            }
        }
    };
```

The only problem with Comparator method as compared to Comparable is : Comaprable is consistent with equalTO
that means, if 2 objects are compared, they will be compared all together
But In case of comparator, the action, in our case will be taken only on price and we will have to manually code 
if we need to compare the seat number as well.

# Maps In Java

Maps are part of collection framework, however they are not true collections.
It replaces the obsolete dictionary abstract class.

- Java Map can not have a duplicate Key and each key can be mapped to only a single value.
- Takes 2 types (1 for key and other for Value.
- 2 classes implement Maps collections - Hashmaps and SortedMaps.
- Put method can be used to add data toi maps.
- Get method can get specific keys
- If we insert values with the same keys, the value will be overwritten, without error.
- Put method will give itself null if the data is inserted the first time, but will give previous data if there was any.
- contains method checks if that key is already existing.
- putIfAbsent() method will insert only if key is not present.
- keySet() will return a set of all the keys.
    ```aidl
        // To get all the keys
        Set<String> keys = myMap.keySet();
        for(String key : keys){
            System.out.println("Key : " + key + " Value : " + myMap.get(key));
        }
    }
    ```
- There is not gauranteed order of the data present in Map.
- remove() method can be used to remove the elements from the list, we can delete based on key level only and key value pair level as well.
    ```aidl
        // to remove on Key value pair
        if(myLanguages.getLanguages().remove("Removal","Let's see if this get's removed")){
            System.out.println("Removal removed");
        }else{
            System.out.println("Key Value pair not matched");
        }
        // To remove based on key
        myLanguages.getLanguages().remove("Removal");

    ```
    this method returns true/False based on it was removed or not.
- replace() method is added to replace the value if the key is already assigned a value.
    ```aidl
        // Checking Replace() method based on key and value
        myLanguages.getLanguages().replace("Replace","This text will be replaced",
                "This text will be replaced again");

        System.out.println("------------------Printing after Replacing(K/V)----------------------------------");
        printMap(myLanguages.getLanguages());

        // Replace based on Key
        myLanguages.getLanguages().replace("Replace","This is the replaced value");
        System.out.println("------------------Printing after Replacing(K)----------------------------------");
        printMap(myLanguages.getLanguages());
   ```


# Sets in Java

1. Sets are just like lists, but they can not contain duplicates.
2. Sets are not having any order, There can be no order.
3. LinkhashSets and Treesets are the ordered implementation of sets.
4. Sets provide add(), remove(), clear() method to add , remove and clear data in sets.
5. size() methods can give the total number of elements in set.
6. contains() method can be used to see if a specific item exists in the set.
7. There is no way we can fetch a specific positional Items from the set, for example if i want to read the 10th element
i will have to iterate all the elements till 10.
   
8. All the things that apply to Keys in map also apply to keys in sets.
9. Best performing interface of sets is Hashset class,It uses hashes to store the items.
10. Hashset implementation uses Hashmap implementation.
11. Whenever an element is added to a set, it becomes the key and a dummy object is inserted as value.
12. Operations on set are very fast.
13. addAll will work as union on the sets, eliminating the duplicates.
14. 








