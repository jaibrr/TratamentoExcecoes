package model.entities;

import model.exception.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){
    }
    

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
        System.out.println("Valor em conta: " + getBalance());
    }
    
    public void withdraw(Double amount) throws DomainException {
        validateWithdraw(amount);
        balance -= amount;
    }

    public void validateWithdraw(Double amount) throws DomainException{
        if(amount > withdrawLimit ){
            throw new DomainException("o valor excede o limite de saque!");
        
        } 
        if(getBalance() < amount) {
            throw new DomainException("saldo indisponível para o saque");
        }
    }
}
