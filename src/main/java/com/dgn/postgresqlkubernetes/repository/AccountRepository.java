package com.dgn.postgresqlkubernetes.repository;

import com.dgn.postgresqlkubernetes.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
