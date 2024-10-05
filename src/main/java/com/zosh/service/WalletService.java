package com.zosh.service;

import com.zosh.modal.Order;
import com.zosh.modal.User;
import com.zosh.modal.Wallet;

public interface WalletService {
    Wallet getUserWallet(User user);
    Wallet addBalance(Wallet wallet,Long money);
    Wallet findWalletById(Long id);
    Wallet  walletToWalletTransfer(User sender, Wallet receiverWallet, Long amount) throws Exception;
     Wallet payOrderPayment(Order order, User user) throws Exception;


}
