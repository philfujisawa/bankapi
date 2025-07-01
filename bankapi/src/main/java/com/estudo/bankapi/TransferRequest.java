package com.estudo.bankapi;

public class TransferRequest {
    private String fromAccount;
    private String toAccount;
    private Double amount;
    private String idempotencyKey;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String contaOrigem) {
        this.fromAccount = contaOrigem;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }
}
