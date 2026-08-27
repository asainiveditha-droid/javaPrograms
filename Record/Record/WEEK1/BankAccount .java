#include <stdio.h>
#include <string.h>

struct Account {
    int accountNumber;
    char name[50];
    float balance;
};

int main() {
    struct Account acc;
    int choice;
    float amount;

    acc.accountNumber = 0;
    acc.balance = 0;

    while (1) {
        printf("\n========== BANK MANAGEMENT SYSTEM ==========\n");
        printf("1. Create Account\n");
        printf("2. Deposit Money\n");
        printf("3. Withdraw Money\n");
        printf("4. Check Balance\n");
        printf("5. Display Account Details\n");
        printf("6. Exit\n");
        printf("============================================\n");

        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {

            case 1:
                printf("\nEnter Account Number: ");
                scanf("%d", &acc.accountNumber);

                printf("Enter Account Holder Name: ");
                scanf(" %[^\n]", acc.name);

                printf("Enter Initial Deposit: ");
                scanf("%f", &acc.balance);

                printf("\nAccount created successfully!\n");
                break;

            case 2:
                if (acc.accountNumber == 0) {
                    printf("\nPlease create an account first.\n");
                } else {
                    printf("\nEnter amount to deposit: ");
                    scanf("%f", &amount);

                    if (amount > 0) {
                        acc.balance += amount;
                        printf("Amount deposited successfully!\n");
                        printf("Current Balance: %.2f\n", acc.balance);
                    } else {
                        printf("Invalid amount!\n");
                    }
                }
                break;

            case 3:
                if (acc.accountNumber == 0) {
                    printf("\nPlease create an account first.\n");
                } else {
                    printf("\nEnter amount to withdraw: ");
                    scanf("%f", &amount);

                    if (amount <= 0) {
                        printf("Invalid amount!\n");
                    } else if (amount > acc.balance) {
                        printf("Insufficient balance!\n");
                    } else {
                        acc.balance -= amount;
                        printf("Amount withdrawn successfully!\n");
                        printf("Current Balance: %.2f\n", acc.balance);
                    }
                }
                break;

            case 4:
                if (acc.accountNumber == 0) {
                    printf("\nPlease create an account first.\n");
                } else {
                    printf("\nYour current balance is: %.2f\n",
                           acc.balance);
                }
                break;

            case 5:
                if (acc.accountNumber == 0) {
                    printf("\nPlease create an account first.\n");
                } else {
                    printf("\n========== ACCOUNT DETAILS ==========\n");
                    printf("Account Number : %d\n",
                           acc.accountNumber);
                    printf("Account Holder : %s\n",
                           acc.name);
                    printf("Balance        : %.2f\n",
                           acc.balance);
                    printf("=====================================\n");
                }
                break;

            case 6:
                printf("\nThank you for using the Bank Management System!\n");
                return 0;

            default:
                printf("\nInvalid choice! Please try again.\n");
        }
    }

    return 0;
}