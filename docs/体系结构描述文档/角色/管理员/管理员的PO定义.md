```java
class AdminPO extends EmpolyeePO{
}
```

```java
class UserAccountPO{
    String ID;
    String name;
    String accountName;
    String password;
    boolean hasRoot;
    AccountState state;
}
```

```java
enum UserAccountState{
    Using;
    Abondoned;
}
```

