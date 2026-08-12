# Print numbers from 1 to N using recursion.
# Example: N = 5 → 1 2 3 4 5

def print_numbers(n):
    if n == 0:
        return
    print_numbers(n - 1)
    print(n)


print_numbers(5)