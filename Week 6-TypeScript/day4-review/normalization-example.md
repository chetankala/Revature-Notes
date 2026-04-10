### 1. **UserProfiles**

```java
package com.example.models;

import java.time.LocalDate;

public class UserProfile {
    private int userProfileId;
    private int accountId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int mailingAddressId;
    private LocalDate dateOfBirth;
    private int creditScore;
}
```

### 2. **Accounts**

```java
package com.example.models;

public class Account {
    private int accountId;
    private String email;
    private String password;
    private int accountTypeId;
}
```

### 3. **AccountTypes**

```java
package com.example.models;

public class AccountType {
    private int accountTypeId;
    private String accountType;
}
```

### 4. **MailingAddresses**

```java
package com.example.models;

public class MailingAddress {
    private int mailingAddressId;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
}
```

### 5. **LoanApplications**

```java
package com.example.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LoanApplication {
    private int loanApplicationId;
    private int loanTypeId;
    private BigDecimal principalBalance;
    private int termLength;
    private float interest;
    private BigDecimal totalBalance;
    private int applicationStatusId;
    private int borrowerId;
    private LocalDate applicationDate;
}
```

### 6. **ApplicationStatuses**

```java
package com.example.models;

public class ApplicationStatus {
    private int applicationStatusId;
    private String applicationStatus;
}
```

### 7. **LoanTypes**

```java
package com.example.models;

public class LoanType {
    private int loanTypeId;
    private String loanType;
}
```
