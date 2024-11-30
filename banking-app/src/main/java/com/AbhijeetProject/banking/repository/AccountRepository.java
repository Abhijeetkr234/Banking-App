package com.AbhijeetProject.banking.repository;

import com.AbhijeetProject.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
