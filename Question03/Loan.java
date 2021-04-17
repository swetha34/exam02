/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Loan {

    String acno;
    int balance;
    int pamount;
    int lamount;

    public Loan(String acno, int lamount, int pamount) {
        this.acno = acno;
        this.pamount = pamount;
        this.lamount = lamount;
        balance = lamount - pamount;
    }

    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPamount() {
        return pamount;
    }

    public void setPamount(int pamount) {
        this.pamount = pamount;
    }

    public int getLamount() {
        return lamount;
    }

    public void setLamount(int lamount) {
        this.lamount = lamount;
    }

    @Override
    public String toString() {
        return "Account No : " + acno + " \nBalance : " + balance;
    }
}
