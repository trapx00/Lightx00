```java
class userStaffPO extends EmpolyeePO{
}
```

```java
class userAccountPO{
    String ID;
    String name;
    String accountName;
    String password;
    boolean hasRoot;
    AccountState state;
}
```

```java
enum AccountState{
    Using;
    Abondoned;
}
```

