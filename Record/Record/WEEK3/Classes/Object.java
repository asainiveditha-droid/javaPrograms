#include <stdio.h>

int main() {
    int n, i, count = 0;
    int temp, rev = 0, rem;

    printf("Enter a number: ");
    scanf("%d", &n);

    /* Check prime */
    for (i = 1; i <= n; i++) {
        if (n % i == 0)
            count++;
    }

    /* Check palindrome */
    temp = n;

    while (temp != 0) {
        rem = temp % 10;
        rev = rev * 10 + rem;
        temp = temp / 10;
    }

    if (count == 2 && rev == n)
        printf("%d is a Prime Palindrome\n", n);
    else
        printf("%d is not a Prime Palindrome\n", n);

    return 0;
}