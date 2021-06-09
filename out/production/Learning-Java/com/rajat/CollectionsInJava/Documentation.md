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










