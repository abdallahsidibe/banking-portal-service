package com.webapp.bankingportal.service;

import com.webapp.bankingportal.dto.AccountResponse;
import com.webapp.bankingportal.dto.UserResponse;

import java.util.List;

public interface DashboardService {
    List<UserResponse> getAllUsers();

    UserResponse getUserDetails(String accountNumber);

    AccountResponse getAccountDetails(String accountNumber);

    List<UserResponse> searchUsers(String keyword);
}