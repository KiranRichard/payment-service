package com.ecommerce.payment.request;

import com.ecommerce.payment.enums.AccountStatus;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateAccount {

    private String accountHolderFirstName;
    private String accountHolderLastName;
    private LocalDate dateOfBirth;
    private String emailId;
    private AccountStatus accountStatus;
}
