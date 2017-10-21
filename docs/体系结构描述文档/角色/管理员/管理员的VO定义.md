```java
class AdminVO extends EmployeeVO{
}

class UserAccountQueryVO{
    String ID;
    String name;
    String accountName;
    String password;
    boolean hasRoot;
}

class UserAccountVO{
    String ID;
    String name;
    String accountName;
    String password;
    boolean hasRoot;
    AccountState state;
}
```

