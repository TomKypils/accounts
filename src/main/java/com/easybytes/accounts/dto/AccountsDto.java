package com.easybytes.accounts.dto;


import lombok.Data;

// Accounts Dto
@Data
public class AccountsDto {

    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
