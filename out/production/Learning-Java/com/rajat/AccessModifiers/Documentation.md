# Access Modifiers

### Public 
If everything is public that will allow all the classes that are using the class to modify the variables that are public directly.

```
    public  String accountName;
    public  int balance = 0;
    public ArrayList<Integer> transactions;
```
Available even in different packages.

*** 
 * Everything in Interface is always public

### Private
If variables are defined as Private, only the classes that contain them can access them and if externally they have to be accessed they have to be done by a public method.

```
    private  String accountName;
    private  int balance = 0;
    private ArrayList<Integer> transactions;
```

Private class can not be defined at top level.

### Package Private
Don't specify anything, they are default and they are available to everyone in the same package.

```aidl
    class packagePrivate{
        ....
    }
```

### Protected
Protected are used when they are available in their package as well as any child classes as well.
