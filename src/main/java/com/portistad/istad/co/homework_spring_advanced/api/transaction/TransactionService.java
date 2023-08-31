package com.portistad.istad.co.homework_spring_advanced.api.transaction;


import org.aspectj.weaver.ast.Var;

public interface TransactionService {
   Long transactionTransfers(Integer sender, Integer receiver, Long amount,String remark);
}
