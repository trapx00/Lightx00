```java
class userStaffPO extends EmpolyeePO{
}

class userAccountPO{
    String ID;
    String name;
    String accountName;
    String password;
    boolean hasRoot;
    AccountState state;
}

enum AccountState{
    Using;
    Abondoned;
}
```

